package com.jwt.example.jwtexample3.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;



// all the rewuired methods qwill be generated by the lombok. 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class User {
    private String userId;
    private String name;
    private String email;
}