package com.careerguidence.controllers;

import com.careerguidence.dao.type.EnterpriceWork;
import com.careerguidence.dao.type.Work;
import com.careerguidence.services.interfaces.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkController{

    @Autowired
    private WorkService workService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Work getWorkById(Long id) {
        return workService.getWorkById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Work getWorkByName(String name) {
        return workService.getWorkByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertWork(Work work) {
        workService.insertWork(work);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateWork(Work work) {
        workService.updateWork(work);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteWorkById(Long id) {
        workService.deleteWorkById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Work> getAll() {
        return workService.getAll();
    }

    @RequestMapping(value = "/get-by-enterprice-id" , method = RequestMethod.GET)
    public List<EnterpriceWork> getEnterpriceWorkByEnterpriceId(Long id){
        return workService.getEnterpriceWorkByEnterpriceId(id);
    }

    @RequestMapping(value = "/get-by-enterprice-name" , method = RequestMethod.GET)
    public List<EnterpriceWork> getEnterpriceWorkByEnterpriceName(String name){
        return workService.getEnterpriceWorkByEnterpriceName(name);
    }

    @RequestMapping(value = "/get-enterprice-work-by-work-name" , method = RequestMethod.GET)
    public List<EnterpriceWork> getEnterpriceWorkByWorkName(String name){
        return workService.getEnterpriceWorkByWorkName(name);
    }

}
