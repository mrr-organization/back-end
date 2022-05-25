package com.api.mrr.model.payload.request;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class SignupRequest {
    private String email;
    private String password;
    private String phone;
    private Set<String> roles;
}
