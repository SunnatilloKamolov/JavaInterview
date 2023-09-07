package com.example.appunlimituniversity.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService messageServiceSMS;
    @Autowired
    @Qualifier("messageServiceMMS")
    private MessageService messageServiceMMS;

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Autowired
    public void setMessageServiceSMS(MessageService messageServiceSMS) {
        this.messageServiceSMS = messageServiceSMS;
    }

    public void sentMessage(String message) {
        this.messageService.sendMessage(message);
        this.messageServiceSMS.sendMessage(message);
        this.messageServiceMMS.sendMessage(message);
    }
}
