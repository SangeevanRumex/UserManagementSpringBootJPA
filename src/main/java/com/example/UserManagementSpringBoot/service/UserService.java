package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    String addUser(User user);
    String updateUser(User user);
    String deleteUser(int id);
    List<User> getUsers();
    User getUserById(int id);

}
