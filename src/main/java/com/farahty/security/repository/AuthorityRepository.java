package com.farahty.security.repository;

import com.farahty.model.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nimer on 1/23/17.
 */
public interface AuthorityRepository extends JpaRepository<Authority , Long> {
    Authority findById(int id);

}
