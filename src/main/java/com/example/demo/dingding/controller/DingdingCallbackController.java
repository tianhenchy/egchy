package com.example.demo.dingding.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dingding.service.DingdingCallbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/dingding")
@Slf4j
public class DingdingCallbackController {

    @Autowired
    private DingdingCallbackService dingdingCallbackService;

    @RequestMapping("/callback")
    public Map<String, String> callback(
            @RequestParam(value = "msg_signature", required = false) String msg_signature,
            @RequestParam(value = "timestamp", required = false) String timeStamp,
            @RequestParam(value = "nonce", required = false) String nonce,
            @RequestBody(required = false) JSONObject json)  {

        return dingdingCallbackService.callback(msg_signature,timeStamp,nonce,json);
    }
}
