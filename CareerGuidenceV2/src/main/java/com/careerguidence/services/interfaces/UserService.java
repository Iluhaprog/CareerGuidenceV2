package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.User;
import com.careerguidence.dao.type.UserWithRole;

import java.util.List;

public interface UserService {

    public User getUserById(Long id);
    public List<User> getUserByName(String name);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUserById(Long id);
    public List<User> getAll();

    public UserWithRole getUserWithRoleById(Long id);

}
