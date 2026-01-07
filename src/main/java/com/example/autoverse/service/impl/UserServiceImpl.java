package com.example.autoverse.service.impl;

import com.example.autoverse.entity.User;
import com.example.autoverse.exceptions.UserException;
import com.example.autoverse.repository.UserRepository;
import com.example.autoverse.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User createUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new UserException("User not found"));
    }

    @Override
    public User updateUser(Long id, User user) {
       User existingUser = repo.findById(id)
               .orElseThrow(()-> new UserException("User not found!"));

       existingUser.setFullName(user.getFullName());
       existingUser.setEmail(user.getEmail());
       existingUser.setPhoneNumber(user.getPhoneNumber());
       existingUser.setRole(user.getRole());

       return repo.save(existingUser);
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
