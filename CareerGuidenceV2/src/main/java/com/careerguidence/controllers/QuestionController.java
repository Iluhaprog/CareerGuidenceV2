package com.careerguidence.controllers;

import com.careerguidence.dao.type.Question;
import com.careerguidence.services.interfaces.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController{

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Question getQuestionById(Long id) {
        return questionService.getQuestionById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Question getQuestionByName(String name) {
        return questionService.getQuestionByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void insertQuestion(Question question) {
        questionService.insertQuestion(question);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateQuestion(Question question) {
        questionService.updateQuestion(question);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteQuestionById(Long id) {
        questionService.deleteQuestionById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Question> getAll() {
        return questionService.getAll();
    }
}
