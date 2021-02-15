package com.training.springboottwilioapi;

public interface SmsSender {
    void sendSms(SmsRequest smsRequest);
}
