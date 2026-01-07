package com.example.autoverse.controller;
import com.example.autoverse.dto.UserDTO;
import com.example.autoverse.entity.User;
import com.example.autoverse.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers().stream()
                .map(user -> new UserDTO(user.getId(), user.getFullName(), user.getEmail(), user.getPhoneNumber(),
                        user.getRole()))
                .toList();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return new UserDTO(user.getId(), user.getFullName(), user.getEmail(), user.getPhoneNumber(), user.getRole());
    }

    @PostMapping("/add")
    public UserDTO addUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new UserDTO(createdUser.getId(), createdUser.getFullName(), createdUser.getEmail(),
                createdUser.getPhoneNumber(), createdUser.getRole());
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody User user){
        User updatedUser = userService.updateUser(id, user);
        return new UserDTO(updatedUser.getId(), updatedUser.getFullName(), updatedUser.getEmail(),
                updatedUser.getPhoneNumber(), updatedUser.getRole());
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}

