package org.bwf.study.controller;

import org.bwf.study.util.MSGOpr;
import org.bwf.study.util.RedisUntil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping(value = "api/msg")
public class MSGController {

    @Resource
    private RedisUntil redisUntil;

    @GetMapping("/reg")
    public String RegisterMSG(String phoneNumber) throws UnsupportedEncodingException {
        Integer valCode = (int) ((Math.random() * 9 + 1) * 100000);
        String message =  MSGOpr.send(phoneNumber, valCode.toString());
        // 把valCode写入缓存Redis   Register-19222223233
        String key = String.format("Register-%s", phoneNumber);
        // 存放redis
        redisUntil.set(key, valCode, 600);
        return message;
    }
}
