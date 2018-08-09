package com.newapp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class RestTestController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    String helloView() {
        return "hello world";
    }

}