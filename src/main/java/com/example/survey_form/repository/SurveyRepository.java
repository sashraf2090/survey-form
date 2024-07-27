package com.example.survey_form.repository;

// Authors: Sadaf Ashraf

import com.example.survey_form.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
