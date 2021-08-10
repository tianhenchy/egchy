package com.example.demo.dingding.util;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class SignUtil {

    /**
     * 获取签名
     * @param timestamp
     * @param appSecret
     * @return
     * @throws Exception
     */
    public static String getSign(Long timestamp,String appSecret)throws Exception{
        String stringToSign = timestamp + "\n" + appSecret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(appSecret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = new String(Base64.encodeBase64(signData));
        return sign;
    }
}
