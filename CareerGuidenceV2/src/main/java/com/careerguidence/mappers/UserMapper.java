package com.careerguidence.mappers;

import com.careerguidence.dao.type.User;
import com.careerguidence.dao.type.UserWithRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public User getUserById(Long id);
    public List<User> getUserByName(String name);
    public void inserUser(User user);
    public void updateUser(User user);
    public void deleteUserById(Long id);
    public List<User> getAll();

    public UserWithRole getUserWithRoleById(Long id);

}
