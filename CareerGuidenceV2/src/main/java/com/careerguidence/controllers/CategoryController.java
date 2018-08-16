package com.careerguidence.controllers;

import com.careerguidence.dao.type.Category;
import com.careerguidence.dao.type.IdUserAndIdCategory;
import com.careerguidence.dao.type.UserProfessionCategory;
import com.careerguidence.services.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController{

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Category getCategoryById(Long id) {
        return categoryService.getCategoryById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Category getCategoryByName(String name) {
        return categoryService.getCategoryByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertCategory(Category category) {
        categoryService.insertCategory(category);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateCategory(Category category) {
        categoryService.updateCategory(category);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteCategoryById(Long id) {
        categoryService.deleteCategoryById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @RequestMapping(value = "/get-user-category" , method = RequestMethod.GET)
    public UserProfessionCategory getUserCategory(Long id){
        return categoryService.getUserCategory(id);
    }

    @RequestMapping(value = "/update-user-category" , method = RequestMethod.PUT)
    public void updateUserCategory(IdUserAndIdCategory idUserAndIdCategory){
        categoryService.updateUserCaegory(idUserAndIdCategory);
    }

}
