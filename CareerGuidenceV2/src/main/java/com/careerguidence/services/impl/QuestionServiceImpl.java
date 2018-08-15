package com.careerguidence.services.impl;

import com.careerguidence.dao.type.Answer;
import com.careerguidence.dao.type.Question;
import com.careerguidence.mappers.AnswerMapper;
import com.careerguidence.mappers.QuestionMapper;
import com.careerguidence.services.interfaces.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Question getQuestionById(Long id) {
        try{
            return questionMapper.getQuestionById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public Question getQuestionByName(String name) {
        try{
            return questionMapper.getQuestionByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertQuestion(Question question) {
        try{
            questionMapper.insertQuestion(question);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateQuestion(Question question) {
        try{
            questionMapper.updateQuestion(question);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteQuestionById(Long id) {
        try{
            questionMapper.deleteQuestionById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<Question> getAll() {
        try{
            return questionMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public Map<String, List<Answer>> getQuestionWithAnswerByQuestionId(Long id) {
        try{

            Map<String , List<Answer>> question_with_answers = new HashMap<>();
            String question_name = questionMapper.getQuestionById(id).getName();
            question_with_answers.put(question_name , answerMapper.getAnswerByQuestionId(id));
            return question_with_answers;

        }catch(Exception exception){
            throw exception;
        }
    }
}
