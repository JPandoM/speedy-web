package com.gimbernat.speedy_web.repository;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gimbernat.speedy_web.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User>findUserByEmail(String email);
}
