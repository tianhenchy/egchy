package com.example.demo.dingding.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dingding.properties.DingdingProperties;
import com.example.demo.dingding.service.DingdingCallbackService;
import com.example.demo.dingding.service.DingdingEventService;
import com.example.demo.dingding.util.DingCallbackCrypto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class DingdingCallbackServiceImpl implements DingdingCallbackService {

    @Autowired
    private DingdingProperties dingdingProperties ;

    @Autowired
    private DingdingEventService dingdingEventService ;

    @Override
    public Map<String, String> callback(String msg_signature, String timeStamp, String nonce, JSONObject json) {

        try {
            // 1. 从http请求中获取加解密参数

            // 2. 使用加解密类型
            // Constant.OWNER_KEY 说明：
            // 1、开发者后台配置的订阅事件为应用级事件推送，此时OWNER_KEY为应用的APP_KEY。
            // 2、调用订阅事件接口订阅的事件为企业级事件推送，
            //      此时OWNER_KEY为：企业的appkey（企业内部应用）或SUITE_KEY（三方应用）
            DingCallbackCrypto callbackCrypto = new DingCallbackCrypto(dingdingProperties.getToken(),
                    dingdingProperties.getAesKey(), dingdingProperties.getAppKey());
            String encryptMsg = json.getString("encrypt");
            String decryptMsg = callbackCrypto.getDecryptMsg(msg_signature, timeStamp, nonce, encryptMsg);

            // 3. 反序列化回调事件json数据
            JSONObject eventJson = JSONObject.parseObject(decryptMsg);
            String eventType = eventJson.getString("EventType");
            if(eventType.startsWith("user") || eventType.startsWith("org") || eventType.startsWith("label")){
                dingdingEventService.dealEvent(eventType,eventJson);
            }
            // 4. 根据EventType分类处理
            if ("check_url".equals(eventType)) {
                // 测试回调url的正确性
                log.info("测试回调url的正确性");
            } else if ("user_add_org".equals(eventType)) {
                // 处理通讯录用户增加事件
                log.info("发生了：" + eventType + "事件");
            } else {
                // 添加其他已注册的
                log.info("发生了：" + eventType + "事件");
            }

            // 5. 返回success的加密数据
            Map<String, String> successMap = callbackCrypto.getEncryptedMap("success");
            return successMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
