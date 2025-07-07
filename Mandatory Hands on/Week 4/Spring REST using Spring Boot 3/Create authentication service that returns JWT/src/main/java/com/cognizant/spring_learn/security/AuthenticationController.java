package com.cognizant.spring_learn.security;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            // decode base64 username:password
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded, StandardCharsets.UTF_8);

            // split into username and password
            final String[] values = credentials.split(":", 2);
            String username = values[0];
            String password = values[1];

            if (username.equals("user") && password.equals("pwd")) {
                String token = JwtUtil.generateToken(username);
                Map<String, String> tokenMap = new HashMap<>();
                tokenMap.put("token", token);
                return tokenMap;
            } else {
                throw new RuntimeException("Invalid credentials");
            }
        } else {
            throw new RuntimeException("Authorization header missing or invalid");
        }
    }
}
