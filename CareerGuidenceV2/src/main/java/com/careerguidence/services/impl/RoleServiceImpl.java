package com.careerguidence.services.impl;

import com.careerguidence.dao.type.Role;
import com.careerguidence.mappers.RoleMapper;
import com.careerguidence.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRoleById(Long id) {
        try{
            return roleMapper.getRoleById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public Role getRoleByName(String name) {
        try{
            return roleMapper.getRoleByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertRole(Role role) {
        try{
            roleMapper.insertRole(role);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateRole(Role role) {
        try{
            roleMapper.updateRole(role);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteRoleById(Long id) {
        try{
            roleMapper.deleteRoleById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<Role> getAll() {
        try{
            return roleMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }
}
