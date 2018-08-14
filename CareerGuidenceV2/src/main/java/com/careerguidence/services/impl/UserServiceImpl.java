package com.careerguidence.services.impl;

import com.careerguidence.dao.type.User;
import com.careerguidence.dao.type.UserWithRole;
import com.careerguidence.mappers.UserMapper;
import com.careerguidence.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        try{
            return userMapper.getUserById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<User> getUserByName(String name) {
        try{
            return userMapper.getUserByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertUser(User user) {
        try{
            userMapper.inserUser(user);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateUser(User user) {
        try{
            userMapper.updateUser(user);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteUserById(Long id) {
        try{
            userMapper.deleteUserById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<User> getAll() {
        try{
            return userMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public UserWithRole getUserWithRoleById(Long id) {
        return userMapper.getUserWithRoleById(id);
    }
}
