package com.jwt.example.jwtexample3.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.jwtexample3.Models.User;

@Service
public class UserService {
    private List <User> store = new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Rehman", "RehmanChohan20@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"AWais", "AwaisChohan20@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sarfaraz", "SarfarazChohan20@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Jehanzaib", "JehanzaibChohan20@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
