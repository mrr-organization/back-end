package com.api.mrr.model.payload.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
