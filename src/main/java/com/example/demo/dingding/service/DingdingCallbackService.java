package com.example.demo.dingding.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface DingdingCallbackService {

    Map<String, String> callback(String msg_signature, String timeStamp, String nonce, JSONObject json);
}
