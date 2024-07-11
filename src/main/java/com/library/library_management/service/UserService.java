package com.library.library_management.service;

import com.library.library_management.entity.User;
import com.library.library_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    /** This method returns all users of the repository
     *
     * @return All users
     */
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    /** This method return a specific user
     *
     * @param id
     * @return specific user
     */
    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }

    /** this method save or update a user
     *
     * @param user
     */
    public void saveOrUpdate(User user){
        userRepository.save(user);
    }

    /** This method delete a specific user
     *
     * @param id
     */
    public void delete(Long id){
        userRepository.deleteById(id);
    }

}
