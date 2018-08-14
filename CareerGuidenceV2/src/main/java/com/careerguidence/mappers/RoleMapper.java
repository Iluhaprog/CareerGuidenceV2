package com.careerguidence.mappers;

import com.careerguidence.dao.type.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleMapper {

    public Role getRoleById(Long id);
    public Role getRoleByName(String name);
    public void insertRole(Role role);
    public void updateRole(Role role);
    public void deleteRoleById(Long id);
    public List<Role> getAll();

}
