package com.example.survey_form.service;

// Authors: Sadaf Ashraf
// Implementation of SurveyService interface, it uses the predefined methods findall and save from the JPARepository

import com.example.survey_form.exception.ResourceNotFoundException;
import com.example.survey_form.model.Survey;
import com.example.survey_form.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService{
    @Autowired
    private SurveyRepository surveyRepository;
    @Override
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey saveSurvey(Survey survey){
        return surveyRepository.save(survey);
    }

    public Optional<Survey> getSurveyById(long id){
        if(surveyRepository.findById(id).isPresent()){
            return surveyRepository.findById(id);
        }
        else {
            throw new ResourceNotFoundException("Survey not found with id " + id);
        }

    }

    public Survey updateSurvey(long id, Survey surveyDetails) {
        Optional<Survey> optionalSurvey = surveyRepository.findById(id);
        if (optionalSurvey.isPresent()) {
            Survey survey = optionalSurvey.get();
            survey.setFirstName(surveyDetails.getFirstName());
            survey.setLastName(surveyDetails.getLastName());
            survey.setStreetAddress(surveyDetails.getStreetAddress());
            survey.setCity(surveyDetails.getCity());
            survey.setState(surveyDetails.getState());
            survey.setZip(surveyDetails.getZip());
            survey.setTelephoneNumber(surveyDetails.getTelephoneNumber());
            survey.setEmail(surveyDetails.getEmail());
            survey.setDateOfSurvey(surveyDetails.getDateOfSurvey());
            survey.setLikedStudents(surveyDetails.getLikedStudents());
            survey.setLikedLocation(surveyDetails.getLikedLocation());
            survey.setLikedCampus(surveyDetails.getLikedCampus());
            survey.setLikedAtmosphere(surveyDetails.getLikedAtmosphere());
            survey.setLikedDorms(surveyDetails.getLikedDorms());
            survey.setLikedSports(surveyDetails.getLikedSports());
            survey.setHowBecameInterested(surveyDetails.getHowBecameInterested());
            survey.setRecommendingSchool(surveyDetails.getRecommendingSchool());
            survey.setAdditionalComments(surveyDetails.getAdditionalComments());
            return surveyRepository.save(survey);
        } else {
            throw new ResourceNotFoundException("Survey not found with id " + id);
        }
    }

    public void deleteSurveyById(long id){
        surveyRepository.deleteById(id);
    }
}
