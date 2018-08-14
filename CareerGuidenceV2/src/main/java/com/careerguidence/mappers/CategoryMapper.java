package com.careerguidence.mappers;

import com.careerguidence.dao.type.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {

    public Category getCategoryById(Long id);
    public Category getCategoryByName(String name);
    public void insertCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategoryById(Long id);
    public List<Category> getAll();

}
