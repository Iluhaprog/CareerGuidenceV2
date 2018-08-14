package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Question;

import java.util.List;

public interface QuestionService {

    public Question getQuestionById(Long id);
    public Question getQuestionByName(String name);
    public void insertQuestion(Question question);
    public void updateQuestion(Question question);
    public void deleteQuestionById(Long id);
    public List<Question> getAll();

}
