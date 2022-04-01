package org.bwf.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("val/test/")
public class testController {

    @GetMapping
    public String test(){
        int[] s = {1,2,3,4};
        int a = s[5];
        return "拦截器.......";
    }
}
