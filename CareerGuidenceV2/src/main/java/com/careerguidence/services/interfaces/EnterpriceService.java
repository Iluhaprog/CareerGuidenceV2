package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Enterprice;
import com.careerguidence.dao.type.EnterpriceWithRole;

import java.util.List;

public interface EnterpriceService {

    public Enterprice getEnterpriceById(Long id);
    public Enterprice getEnterpriceByName(String name);
    public void insertEnterprice(Enterprice enterprice);
    public void updateEnterprice(Enterprice enterprice);
    public void deleteEnterpriceById(Long id);
    public List<Enterprice> getAll();

    public EnterpriceWithRole getEnterpriceWithRoleById(Long id);

}
