package com.example.demo.dingding.service;

import com.alibaba.fastjson.JSONObject;

/**
 * 通讯录事件
 */
public interface DingdingEventService {

    /**
     * 处理事件
     * @param eventType
     * @param eventJson
     * @return
     */
    String dealEvent(String eventType, JSONObject eventJson);

}
