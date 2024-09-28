package com.jwt.example.jwtexample3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


 
// jwt token contains three things.1) Header, (TokenType and Algo), 2) PAyload(Contains User Data) 3)varify singnature. 


@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        
        UserDetails user = User.builder().username("rehman").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
        UserDetails user1 = User.builder().username("awais").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
        UserDetails user2 = User.builder().username("sarfaraz").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user,user1,user2);

    }  

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }


}
