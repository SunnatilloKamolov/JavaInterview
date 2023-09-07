package com.example.appunlimituniversity.Message.Impl;

import com.example.appunlimituniversity.Message.MessageService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("smsService")

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println(message+"SMS is sent successfully!");
    }
}
