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

    //Constructor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /** This method is the GET request that returns all users
     *
     * @return All users
     */
    @GetMapping()
    public List<User> getAll(){
        return userService.getUsers();
    }

    /** This method is the get request that return a specific user for your ID
     * @param user_id
     * @return specific user
     */
    @GetMapping("/{user_id}")
    public Optional<User> getById(@PathVariable("user_id") Long user_id ){
        return userService.getUser(user_id);
    }

    /** This method is POST request that save or update a user
     *
     * @param user
     */
    @PostMapping
    public void saveUpdate(@RequestBody User user){
        userService.saveOrUpdate(user);
    }

    /** This method is DELETE request that delete a specific user for your ID
     *
     * @param user_id
     */
    @DeleteMapping("/{user_id}")
    public void saveUpdate(@PathVariable("user_id") Long user_id ){
        userService.delete(user_id);
    }


}

