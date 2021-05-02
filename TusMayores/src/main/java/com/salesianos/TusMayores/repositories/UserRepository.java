package com.salesianos.TusMayores.repositories;

import com.salesianos.TusMayores.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);
}
