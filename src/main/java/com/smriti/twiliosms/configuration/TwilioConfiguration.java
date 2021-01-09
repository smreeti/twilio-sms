package com.smriti.twiliosms.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author smriti on 09/01/21
 */
@Configuration
@ConfigurationProperties("twilio")
@Getter
@Setter
public class TwilioConfiguration {

    private String accountSid;

    private String authToken;

    private String trialNumber;
}
