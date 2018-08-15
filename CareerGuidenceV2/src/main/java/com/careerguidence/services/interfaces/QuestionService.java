package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Answer;
import com.careerguidence.dao.type.Question;

import java.util.List;
import java.util.Map;

public interface QuestionService {

    public Question getQuestionById(Long id);
    public Question getQuestionByName(String name);
    public void insertQuestion(Question question);
    public void updateQuestion(Question question);
    public void deleteQuestionById(Long id);
    public List<Question> getAll();

    public Map<String , List<Answer>> getQuestionWithAnswerByQuestionId(Long id);

}
