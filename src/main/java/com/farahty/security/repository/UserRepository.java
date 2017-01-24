package com.farahty.security.repository;

import com.farahty.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by stephan on 20.03.16.
 */


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
