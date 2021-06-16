package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.dao.UserRepository;
import com.example.UserManagementSpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User successfully created";
    }

    public String updateUser(User user) {
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        if(oldUser!=null){
            userRepository.save(user);
            return "User successfully updated";
        }
        return "User not found";
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User successfully deleted";
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
