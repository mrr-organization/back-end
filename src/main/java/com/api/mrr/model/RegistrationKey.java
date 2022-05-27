package com.api.mrr.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegistrationKey implements Serializable {
    private Long userNo;
    private Long roleId;
}
