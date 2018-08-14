package com.careerguidence.services.impl;

import com.careerguidence.dao.type.Enterprice;
import com.careerguidence.dao.type.EnterpriceWithRole;
import com.careerguidence.mappers.EnterpriceMapper;
import com.careerguidence.services.interfaces.EnterpriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriceServiceImpl implements EnterpriceService {

    @Autowired
    private EnterpriceMapper enterpriceMapper;

    @Override
    public Enterprice getEnterpriceById(Long id) {
        try{
            return enterpriceMapper.getEnterpriceById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public Enterprice getEnterpriceByName(String name) {
        try{
            return enterpriceMapper.getEnterpriceByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertEnterprice(Enterprice enterprice) {
        try{
            enterpriceMapper.insertEnterprice(enterprice);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateEnterprice(Enterprice enterprice) {
        try{
            enterpriceMapper.updateEnterprice(enterprice);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteEnterpriceById(Long id) {
        try{
            enterpriceMapper.deleteEnterpriceById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<Enterprice> getAll() {
        try{
            return enterpriceMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public EnterpriceWithRole getEnterpriceWithRoleById(Long id) {
        try{
            return enterpriceMapper.getEnterpriceWithRoleById(id);
        }catch (Exception exceptiion){
            throw exceptiion;
        }
    }
}
