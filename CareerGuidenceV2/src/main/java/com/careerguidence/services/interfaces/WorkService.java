package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.EnterpriceWork;
import com.careerguidence.dao.type.Work;

import java.util.List;

public interface WorkService {

    public Work getWorkById(Long id);
    public Work getWorkByName(String name);
    public void insertWork(Work work);
    public void updateWork(Work work);
    public void deleteWorkById(Long id);
    public List<Work> getAll();

    public List<EnterpriceWork> getEnterpriceWorkByEnterpriceId(Long id);
    public List<EnterpriceWork> getEnterpriceWorkByEnterpriceName(String name);
    public List<EnterpriceWork> getEnterpriceWorkByWorkName(String name);

}
