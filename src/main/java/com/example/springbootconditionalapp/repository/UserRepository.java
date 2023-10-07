package com.example.springbootconditionalapp.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.CollectionStartEvent;
import com.example.springbootconditionalapp.profile.Authorities;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    @Bean
    public List<Authorities> getUserAuthorities(@RequestParam String user, @RequestParam String password) {
        List<Authorities> list = new ArrayList<>();
        if (user.equals("admin") && password.equals("1234")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("3652")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE);
        }
        return list;
    }
}