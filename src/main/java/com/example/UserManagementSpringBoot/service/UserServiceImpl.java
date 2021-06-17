package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean addUser(User user){
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        if(oldUser!=null){
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
