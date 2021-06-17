package com.example.UserManagementSpringBoot.controller;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> addUser(@RequestBody User user){
        if(userService.addUser(user)){
            return ResponseEntity.ok().body("User successfully created");
        };
        return ResponseEntity.badRequest().body("User not created");
    }

    @PutMapping("/user")
    public ResponseEntity<String> updateUser(@RequestBody User user){
        if (userService.updateUser(user)){
            return ResponseEntity.ok().body("User successfully updated");
        };
        return ResponseEntity.badRequest().body("User not updated");
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
        if (userService.deleteUser(id)){
            return ResponseEntity.ok().body("User successfully deleted");
        };
        return ResponseEntity.badRequest().body("User not found");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
        return ResponseEntity.ok().body(userService.getUserById(id));
    }
}
