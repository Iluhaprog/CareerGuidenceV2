package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Category;
import com.careerguidence.dao.type.IdUserAndIdCategory;
import com.careerguidence.dao.type.UserProfessionCategory;

import java.util.List;

public interface CategoryService {

    public Category getCategoryById(Long id);
    public Category getCategoryByName(String name);
    public void insertCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategoryById(Long id);
    public List<Category> getAll();

    public UserProfessionCategory getUserCategory(Long id);
    public void updateUserCaegory(IdUserAndIdCategory idUserAndIdCategory);

}
