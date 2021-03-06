package com.careerguidence.controllers;


import com.careerguidence.dao.type.Answer;
import com.careerguidence.dao.type.Category;
import com.careerguidence.dao.type.IdUserAndIdAnswer;
import com.careerguidence.dao.type.UserAnswer;
import com.careerguidence.services.interfaces.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswerController {


    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "/get-by-id" , method = RequestMethod.GET)
    public Answer getAnswerById(Long id) {
        return answerService.getAnswerById(id);
    }

    @RequestMapping(value = "/get-by-name" , method = RequestMethod.GET)
    public Answer getAnswerByName(String name) {
        return answerService.getAnswerByName(name);
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    public void inserAnswer(Answer answer) {
        answerService.insertAnswer(answer);
    }

    @RequestMapping(value = "/update" , method = RequestMethod.PUT)
    public void updateAnswer(Answer answer) {
        answerService.updateAnswer(answer);
    }

    @RequestMapping(value = "/delete-by-id" , method = RequestMethod.DELETE)
    public void deleteAnswerById(Long id) {
        answerService.deleteAnswerById(id);
    }

    @RequestMapping(value = "/get-all" , method = RequestMethod.GET)
    public List<Answer> getAll() {
        return answerService.getAll();
    }

    @RequestMapping(value = "/insert-user-answer" , method = RequestMethod.POST)
    public void insertUserAnswer(IdUserAndIdAnswer idUserAndIdAnswer){
        answerService.insertUserAnswer(idUserAndIdAnswer);
    }

    @RequestMapping(value = "/get-user-answer" , method = RequestMethod.GET)
    public List<UserAnswer> getUserAnswerById(Long id){
        return answerService.getUserAnswerById(id);
    }

    @RequestMapping(value = "/get-by-question-id" , method = RequestMethod.GET)
    public List<Answer> getAnswerByQuestionId(Long id){
        return answerService.getAnswerByQuestionId(id);
    }

    @RequestMapping(value = "/get-result" , method = RequestMethod.GET)
    public Category getResult(Long id){
        return answerService.getResult(id);
    }

}
