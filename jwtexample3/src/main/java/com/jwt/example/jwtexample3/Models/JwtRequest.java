package com.jwt.example.jwtexample3.Models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class JwtRequest {
    private String email;
    private String password;
    
}
