package com.example.demo.dingding.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "dingding.h5")
public class DingdingProperties {

    private String agentId ;
    private String appKey ;
    private String appSecret ;
    private String aesKey ;
    private String token ;

}
