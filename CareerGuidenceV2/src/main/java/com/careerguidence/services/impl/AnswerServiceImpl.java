package com.careerguidence.services.impl;

import com.careerguidence.dao.type.Answer;
import com.careerguidence.dao.type.IdUserAndIdAnswer;
import com.careerguidence.dao.type.UserAnswer;
import com.careerguidence.mappers.AnswerMapper;
import com.careerguidence.services.interfaces.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Answer getAnswerById(Long id) {
        try {
            return answerMapper.getAnswerById(id);
        }catch(Exception exeption){
            throw exeption;
        }

    }

    @Override
    public List<Answer> getAnswerByQuestionId(Long id) {
        try {
            return answerMapper.getAnswerByQuestionId(id);
        }catch (Exception exception){
            throw exception;
        }
    }

    @Override
    public Answer getAnswerByName(String name) {
        try {
            return answerMapper.getAnswerByName(name);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertAnswer(Answer answer) {
        try {
            answerMapper.insertAnswer(answer);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void updateAnswer(Answer answer) {
        try{
           answerMapper.updateAnswer(answer);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void deleteAnswerById(Long id) {
        try{
            answerMapper.deleteAnswerById(id);
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public List<Answer> getAll() {
        try{
            return answerMapper.getAll();
        }catch(Exception exeption){
            throw exeption;
        }
    }

    @Override
    public void insertUserAnswer(IdUserAndIdAnswer idUserAndIdAnswer){
        try{
            answerMapper.insertUserAnswer(idUserAndIdAnswer);
        }catch(Exception exception){
            throw exception;
        }
    }

    @Override
    public List<UserAnswer> getUserAnswerById(Long id) {
        try{
            return answerMapper.getUserAnswerById(id);
        }catch(Exception exception){
            throw exception;
        }
    }
}
