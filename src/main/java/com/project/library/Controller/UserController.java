package com.project.library.Controller;


import com.project.library.Services.UserService;
import com.project.library.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
      UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List <User> GetAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{userId}")
    public User GetOneUser(@PathVariable long userId){
        return userService.GetOneUser(userId);
    }
    @PostMapping
    public User CreateOneUser(@RequestBody User newuser){
        return userService.AddOneUser(newuser);
    }
    @PutMapping("/{userId}")
    public User UpdateOneUser(@PathVariable Long userId, @RequestBody User newUser){
        return userService.updateUser(userId,newUser);
    }
    @DeleteMapping("/{userId}")
        public void DeleteUserId(@PathVariable Long userId){
            userService.deleteById(userId);
        }
    }


