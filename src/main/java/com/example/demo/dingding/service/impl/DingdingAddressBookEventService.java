package com.example.demo.dingding.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dingding.service.DingdingEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 钉钉通讯录事件业务
 */
@Service
@Slf4j
public class DingdingAddressBookEventService implements DingdingEventService {

    @Override
    public String dealEvent(String eventType, JSONObject eventJson) {

        log.info("处理通讯录事件，eventType={},eventJson={}",eventType,eventJson);
        try{
            if(1==1){

            }
        }catch (Exception e){
            log.error("处理通讯录事件异常，e={}",e);
            throw new RuntimeException("处理通讯录事件异常");
        }
        return null;
    }
}
