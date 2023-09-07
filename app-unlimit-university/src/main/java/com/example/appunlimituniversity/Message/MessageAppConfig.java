package com.example.appunlimituniversity.Message;

import com.example.appunlimituniversity.Message.Impl.EmailService;
import com.example.appunlimituniversity.Message.Impl.SMSService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.appunlimituniversity.Message")
public class MessageAppConfig {
    @Bean("emailService")
    public EmailService emailService() {
        return new EmailService();
    }
    @Bean("smsService")
    @Primary
    public SMSService smsService() {
        return new SMSService();
    }

}
