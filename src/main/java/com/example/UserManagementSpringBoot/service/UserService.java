package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(int id);
    List<User> getUsers();
    User getUserById(int id);

}
