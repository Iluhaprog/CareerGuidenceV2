package com.careerguidence.mappers;

import com.careerguidence.dao.type.EnterpriceWork;
import com.careerguidence.dao.type.Work;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkMapper {

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
