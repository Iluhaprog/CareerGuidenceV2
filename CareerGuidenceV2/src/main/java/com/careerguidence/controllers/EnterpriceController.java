package com.careerguidence.controllers;

import com.careerguidence.dao.type.Enterprice;
import com.careerguidence.dao.type.EnterpriceWithRole;
import com.careerguidence.services.interfaces.EnterpriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enterprice")
public class EnterpriceController {

    @Autowired
    private EnterpriceService enterpriceService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Enterprice getEnterpriceById(Long id) {
        return enterpriceService.getEnterpriceById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Enterprice getEnterpriceByName(String name) {
        return enterpriceService.getEnterpriceByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertEnterprice(Enterprice enterprice) {
        enterpriceService.insertEnterprice(enterprice);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateEnterprice(Enterprice enterprice) {
        enterpriceService.updateEnterprice(enterprice);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteEnterpriceById(Long id) {
        enterpriceService.deleteEnterpriceById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Enterprice> getAll() {
        return enterpriceService.getAll();
    }

    @RequestMapping(value = "/with-role" , method = RequestMethod.GET)
    public EnterpriceWithRole getEnterpriceWithRoleById(Long id){
        return enterpriceService.getEnterpriceWithRoleById(id);
    }
}
