package com.smriti.twiliosms.service.impl;

import com.smriti.twiliosms.configuration.TwilioConfiguration;
import com.smriti.twiliosms.dto.SmsRequestDTO;
import com.smriti.twiliosms.service.SmsSenderService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author smriti on 09/01/21
 */
@Service
@Slf4j
public class SmsSenderServiceImpl implements SmsSenderService {

    private final TwilioConfiguration twilioConfiguration;

    public SmsSenderServiceImpl(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequestDTO smsRequest) {

        log.info("SEND SMS PROCESS STARTED");

        if (isPhoneNumberValid(smsRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();

            MessageCreator creator = Message.creator(to, from, message);
            creator.create();

            log.info("SEND SMS PROCESS COMPLETED {}" + smsRequest);
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number");
        }
    }

    private Boolean isPhoneNumberValid(String phoneNumber) {
        //todo: implement phone number validation
        return true;
    }
}
