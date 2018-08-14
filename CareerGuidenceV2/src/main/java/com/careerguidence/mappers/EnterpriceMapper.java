package com.careerguidence.mappers;

import com.careerguidence.dao.type.Enterprice;
import com.careerguidence.dao.type.EnterpriceWithRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EnterpriceMapper {

    public Enterprice getEnterpriceById(Long id);
    public Enterprice getEnterpriceByName(String name);
    public void insertEnterprice(Enterprice enterprice);
    public void updateEnterprice(Enterprice enterprice);
    public void deleteEnterpriceById(Long id);
    public List<Enterprice> getAll();

    public EnterpriceWithRole getEnterpriceWithRoleById(Long id);

}
