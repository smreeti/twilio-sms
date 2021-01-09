package com.smriti.twiliosms.service;

import com.smriti.twiliosms.dto.SmsRequestDTO;

/**
 * @author smriti on 09/01/21
 */
public interface SmsSenderService {

    void sendSms(SmsRequestDTO smsRequest);
}
