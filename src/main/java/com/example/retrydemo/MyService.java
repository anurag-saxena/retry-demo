package com.example.retrydemo;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Retryable(maxAttempts=9,value=Exception.class,backoff=@Backoff(delay = 5000))
    void display(String name){
        System.out.println(name);
        throw new RuntimeException( "hi...");
    }

}
