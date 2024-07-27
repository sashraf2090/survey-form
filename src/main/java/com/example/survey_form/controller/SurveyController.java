package com.example.survey_form.controller;

// Authors: Sadaf Ashraf
// Survey Controller class containing the HTTP calls and URI mapping

import com.example.survey_form.exception.ResourceNotFoundException;
import com.example.survey_form.model.Survey;
import com.example.survey_form.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin
public class SurveyController {

    @Autowired
    SurveyService surveyService;

    @GetMapping()
    public ResponseEntity<List<Survey>> getAllSurveys() {
        List<Survey> surveys = surveyService.getAllSurveys();
        return new ResponseEntity<>(surveys, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey) {
        Survey savedSurvey = surveyService.saveSurvey(survey);
        return new ResponseEntity<>(savedSurvey, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable Integer id) {
        try {
        Optional<Survey> survey = surveyService.getSurveyById(id);

            return new ResponseEntity<>(survey.get(), HttpStatus.OK);

        }catch (ResourceNotFoundException e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Survey> updateSurvey(@PathVariable Integer id, @RequestBody Survey surveyDetails) {
        try {
            Survey updatedSurvey = surveyService.updateSurvey(id, surveyDetails);
            return new ResponseEntity<>(updatedSurvey, HttpStatus.OK);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurveyById(@PathVariable Integer id) {
        try {
            Optional<Survey> survey = surveyService.getSurveyById(id);
            surveyService.deleteSurveyById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}