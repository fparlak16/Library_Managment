package com.project.library.Services;

import com.project.library.Repositories.UserRepo;
import com.project.library.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepo userRepo;
    public UserService(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }

    public List <User> getAllUsers() {
        return userRepo.findAll();
    }

    public User GetOneUser(long userId) {
       return userRepo.findById(userId).orElse(null);
    }

    public User AddOneUser(User newuser) {
        return userRepo.save(newuser);
    }

    public User updateUser(Long userId, User newUser) {
        Optional <User> user= userRepo.findById(userId);
        if (user.isPresent()){
            User foundUser= user.get();
            foundUser.setUsername(newUser.getUsername());
            foundUser.setE_mail(newUser.getE_mail());
            foundUser.setPassword(newUser.getPassword());
            userRepo.save(foundUser);
            return foundUser;
        }
        else{
            return null;
        }
    }
    public void deleteById(Long userId) {
        userRepo.deleteById(userId);
    }
}
