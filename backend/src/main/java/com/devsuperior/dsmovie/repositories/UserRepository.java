package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entitties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);
}