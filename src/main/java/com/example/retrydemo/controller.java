package com.example.retrydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller extends MyService {
    @Autowired
    MyService service;
// try the method 9 times with 2 seconds delay.

    @RequestMapping(value = "/api/{name}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    String  hello(@PathVariable String name){
        service.display(name);
        return "true";
    }

}
