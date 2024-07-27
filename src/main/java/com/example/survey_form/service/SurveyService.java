package com.example.survey_form.service;

// Authors: Sadaf Ashraf
// SurveyService interface with two methods for save and getting all surveys

import com.example.survey_form.model.Survey;

import java.util.List;
import java.util.Optional;

public interface SurveyService {

    List<Survey> getAllSurveys();

    Survey saveSurvey(Survey survey);

    Optional<Survey> getSurveyById(long id);

    Survey updateSurvey(long id, Survey survey);

    void deleteSurveyById(long id);
}
