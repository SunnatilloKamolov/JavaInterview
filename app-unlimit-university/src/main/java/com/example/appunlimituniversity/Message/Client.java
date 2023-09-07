package com.example.appunlimituniversity.Message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message="Hi guys,I will be there in 2 hours ";
        ApplicationContext context=new AnnotationConfigApplicationContext(MessageAppConfig.class);
        MessageSender messageSender=context.getBean(MessageSender.class);
        messageSender.sentMessage(message);
    }
}
