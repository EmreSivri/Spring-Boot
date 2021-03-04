package com.example.springsecurityandjwtintegrationswagger2apidocumentation.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class DummyUserService {

    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        users.put("Emre", new User("Emre","emre/osmanlı97",new ArrayList<>()));
        users.put("Recep", new User("Recep", "Recep1994", new ArrayList<>()));
        users.put("Ayhan", new User("Ayhan", "Ayhan1968", new ArrayList<>()));
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }

}
