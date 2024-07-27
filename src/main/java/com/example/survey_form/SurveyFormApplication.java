package com.example.survey_form;

// Author: Sadaf Ashraf
// SurveyFormApplication Main Class

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com/example/survey_form/repository")
public class SurveyFormApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SurveyFormApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SurveyFormApplication.class);
	}

}
