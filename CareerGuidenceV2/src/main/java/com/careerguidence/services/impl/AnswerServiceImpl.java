package com.careerguidence.services.impl;

import com.careerguidence.dao.type.*;
import com.careerguidence.mappers.AnswerMapper;
import com.careerguidence.mappers.CategoryMapper;
import com.careerguidence.mappers.UserMapper;
import com.careerguidence.services.interfaces.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private UserMapper userMapper;

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

    @Override
    public Category getResult(Long id){
        try {

            List<CounterWithIdCategory> list_countersWithIdCategories = new ArrayList<>();
            for ( Long i = 0L ; i < 7 ; i++ ) {
                list_countersWithIdCategories.add(new CounterWithIdCategory(i , 0));
            }

            List<Integer> list_points = new ArrayList<>();
            for(int i = 0; i < answerMapper.getUserAnswerById(id).size(); i++){
                list_points.add(answerMapper.getUserAnswerById(id).get(i).getPoints());
            }

            for (int i = 0 ; i < list_countersWithIdCategories.size(); i++  ) {
                int count = 0;
                for ( int j = 0 ; j < list_points.size(); j++ ){

                    if ( list_countersWithIdCategories.get(i).getId_category() == (long)list_points.get(j) ) {
                        count++;
                        list_countersWithIdCategories.add(new CounterWithIdCategory((long)i , count));
                    }

                }
            }

            int max_val = 0;
            Long category = 0L;
            for ( int i = 0 ; i < list_countersWithIdCategories.size(); i++ ) {
                if ( max_val < list_countersWithIdCategories.get(i).getCounter() ) {
                    max_val = list_countersWithIdCategories.get(i).getCounter();
                    category = list_countersWithIdCategories.get(i).getId_category();
                }
            }

            return categoryMapper.getCategoryById(category);

        }catch (Exception exception){
            throw exception;
        }
    }

}
