package com.smriti.twiliosms.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author smriti on 09/01/21
 */
@Getter
@Setter
public class SmsRequestDTO implements Serializable {

    @NotNull
    @NotBlank
    private String phoneNumber; //destination

    @NotNull
    @NotBlank
    private String message;
}
