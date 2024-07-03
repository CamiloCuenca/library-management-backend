package com.library.library_management.controller;

import com.library.library_management.entity.User;
import com.library.library_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "v1/users")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAll(){
        return userService.getUsers();
    }

    @GetMapping("/{user_id}")
    public Optional<User> getById(@PathVariable("user_id") Long user_id ){
        return userService.getUser(user_id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody User user){
        userService.saveOrUpdate(user);
    }

    @DeleteMapping("/{user_id}")
    public void saveUpdate(@PathVariable("user_id") Long user_id ){
        userService.delete(user_id);
    }


}

