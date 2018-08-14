package com.careerguidence.controllers;

import com.careerguidence.dao.type.Role;
import com.careerguidence.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Role getRoleById(Long id) {
        return roleService.getRoleById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Role getRoleByName(String name) {
        return roleService.getRoleByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertRole(Role role) {
        roleService.insertRole(role);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateRole(Role role) {
        roleService.updateRole(role);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteRoleById(Long id) {
        roleService.deleteRoleById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Role> getAll() {
        return roleService.getAll();
    }
}
