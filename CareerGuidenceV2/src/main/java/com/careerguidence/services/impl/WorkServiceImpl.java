package com.careerguidence.services.impl;

import com.careerguidence.dao.type.EnterpriceWork;
import com.careerguidence.dao.type.Work;
import com.careerguidence.mappers.WorkMapper;
import com.careerguidence.services.interfaces.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkMapper workMapper;

    @Override
    public Work getWorkById(Long id) {
        try{
            return workMapper.getWorkById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public Work getWorkByName(String name) {
        try{
            return workMapper.getWorkByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertWork(Work work) {
        try{
            workMapper.insertWork(work);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateWork(Work work) {
        try{
            workMapper.updateWork(work);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteWorkById(Long id) {
        try{
            workMapper.deleteWorkById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<Work> getAll() {
        try{
            return workMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<EnterpriceWork> getEnterpriceWorkByEnterpriceId(Long id) {
        try{
            return workMapper.getEnterpriceWorkByEnterpriceId(id);
        }catch(Exception exception){
            throw exception;
        }
    }

    @Override
    public List<EnterpriceWork> getEnterpriceWorkByEnterpriceName(String name) {
        try{
            return workMapper.getEnterpriceWorkByEnterpriceName(name);
        }catch(Exception exception) {
            throw exception;
        }
    }

    @Override
    public List<EnterpriceWork> getEnterpriceWorkByWorkName(String name) {
        try{
            return workMapper.getEnterpriceWorkByWorkName(name);
        }catch(Exception exception){
            throw exception;
        }
    }
}
