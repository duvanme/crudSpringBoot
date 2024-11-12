package com.example.crudSpringBoot.repository;

import com.example.crudSpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
