package com.zll.start.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class aa {
    @RequestMapping("test")
    public String aa(){
        return "consule222";
    }
}
