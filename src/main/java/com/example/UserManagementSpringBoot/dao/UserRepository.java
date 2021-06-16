package com.example.UserManagementSpringBoot.dao;

import com.example.UserManagementSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
