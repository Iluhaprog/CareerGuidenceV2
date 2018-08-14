package com.careerguidence.mappers;

import com.careerguidence.dao.type.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QuestionMapper {

    public Question getQuestionById(Long id);
    public Question getQuestionByName(String name);
    public void insertQuestion(Question question);
    public void updateQuestion(Question question);
    public void deleteQuestionById(Long id);
    public List<Question> getAll();

}
