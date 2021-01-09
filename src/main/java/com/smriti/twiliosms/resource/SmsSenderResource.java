package com.smriti.twiliosms.resource;

import com.smriti.twiliosms.dto.SmsRequestDTO;
import com.smriti.twiliosms.service.SmsSenderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author smriti on 09/01/21
 */
@RestController
@RequestMapping("api/v1/sms")
public class SmsSenderResource {

    private final SmsSenderService smsSenderService;

    public SmsSenderResource(SmsSenderService smsSenderService) {
        this.smsSenderService = smsSenderService;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequestDTO smsRequestDTO) {
        smsSenderService.sendSms(smsRequestDTO);
    }
}
