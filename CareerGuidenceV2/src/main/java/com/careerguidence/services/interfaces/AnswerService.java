package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Answer;

import java.util.List;

public interface AnswerService {

    public Answer getAnswerById(Long id);
    public Answer getAnswerByName(String name);
    public void insertAnswer(Answer answer);
    public void updateAnswer(Answer answer);
    public void deleteAnswerById(Long id);
    public List<Answer> getAll();

}
