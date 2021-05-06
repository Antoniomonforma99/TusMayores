package com.salesianos.TusMayores.services;

import com.salesianos.TusMayores.repositories.UserRepository;
import com.salesianos.TusMayores.model.User;
import com.salesianos.TusMayores.services.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class userService extends BaseService<User, Long, UserRepository> {

    public userService(UserRepository repo) {
        super(repo);
    }

    public Optional<User> buscarPorEmail(String email) {
        return repository.findFirstByEmail(email);
    }
}
