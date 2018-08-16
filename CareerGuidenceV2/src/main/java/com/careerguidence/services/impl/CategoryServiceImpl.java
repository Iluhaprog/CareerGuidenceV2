package com.careerguidence.services.impl;

import com.careerguidence.dao.type.Category;
import com.careerguidence.dao.type.IdUserAndIdCategory;
import com.careerguidence.dao.type.UserProfessionCategory;
import com.careerguidence.mappers.CategoryMapper;
import com.careerguidence.services.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category getCategoryById(Long id) {
        try{
            return categoryMapper.getCategoryById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public Category getCategoryByName(String name) {
        try{
            return categoryMapper.getCategoryByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertCategory(Category category) {
        try{
            categoryMapper.insertCategory(category);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateCategory(Category category) {
        try{
            categoryMapper.updateCategory(category);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteCategoryById(Long id) {
        try{
            categoryMapper.deleteCategoryById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<Category> getAll() {
        try{
            return categoryMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public UserProfessionCategory getUserCategory(Long id) {
        try{
            return categoryMapper.getUserCategory(id);
        }catch (Exception exception){
            throw exception;
        }
    }

    @Override
    public void updateUserCaegory(IdUserAndIdCategory idUserAndIdCategory) {
        try{
            categoryMapper.updateUserCategory(idUserAndIdCategory);
        }catch(Exception exception){
            throw exception;
        }
    }
}
