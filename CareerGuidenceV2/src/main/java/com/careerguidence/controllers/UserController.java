package com.careerguidence.controllers;

import com.careerguidence.dao.type.User;
import com.careerguidence.dao.type.UserWithRole;
import com.careerguidence.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public List<User> getUserByName(String name) {
        return userService.getUserByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertUser(User user) {
        userService.insertUser(user);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteUserById(Long id) {
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping(value = "/with-role" , method = RequestMethod.GET)
    public UserWithRole getUserWithRoleById(Long id){
        return userService.getUserWithRoleById(id);
    }
}
