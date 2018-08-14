package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Role;

import java.util.List;

public interface RoleService {

    public Role getRoleById(Long id);
    public Role getRoleByName(String name);
    public void insertRole(Role role);
    public void updateRole(Role role);
    public void deleteRoleById(Long id);
    public List<Role> getAll();


}
