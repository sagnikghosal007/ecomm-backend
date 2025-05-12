package com.saggy.ecomm_backend.service;


import com.saggy.ecomm_backend.model.User;
import com.saggy.ecomm_backend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // fieled dependancy injection
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        try{
            User newUser=userRepository.save(user);
            System.out.println("User added to database");
            return newUser;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public User loginUser(String email, String password) {
        //check if user is there or not
        User user = userRepository.findByEmail(email);
        if(user!=null && user.getPassword().equals(password))
        {
            return user;
        }
        return null;// invalid credentials
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
