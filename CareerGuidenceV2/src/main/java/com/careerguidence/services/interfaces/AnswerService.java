package com.careerguidence.services.interfaces;

import com.careerguidence.dao.type.Answer;
import com.careerguidence.dao.type.IdUserAndIdAnswer;
import com.careerguidence.dao.type.UserAnswer;

import java.util.List;

public interface AnswerService {

    public Answer getAnswerById(Long id);
    public List<Answer> getAnswerByQuestionId(Long id);
    public Answer getAnswerByName(String name);
    public void insertAnswer(Answer answer);
    public void updateAnswer(Answer answer);
    public void deleteAnswerById(Long id);
    public List<Answer> getAll();

    public void insertUserAnswer(IdUserAndIdAnswer idUserAndIdAnswer);
    public List<UserAnswer> getUserAnswerById(Long id);

}
