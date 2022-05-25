package com.api.mrr.model.payload.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class JwtResponse {
    private String accessToken;
    private final String tokenType = "Bearer";
    private Long userNo;
    private String userEmail;
    private String userFullName;
    private List<String> roles;
}
