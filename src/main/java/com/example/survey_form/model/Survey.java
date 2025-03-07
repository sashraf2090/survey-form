package com.example.survey_form.model;

// Authors: Sadaf Ashraf
// Survey Model class

import jakarta.persistence.*;

@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "street_address", nullable = false)
    private  String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private  String state;

    @Column(name = "zip", nullable = false)
    private String zip;

    @Column(name = "telephone_number", nullable = false)
    private  String telephoneNumber;

    @Column(name = "email", nullable = false)
    private  String email;

    @Column(name = "date_of_survey", nullable = false)
    private String dateOfSurvey;

    @Column(name = "liked_students", nullable = true)
    private  Boolean likedStudents;

    @Column(name = "liked_location", nullable = true)
    private  Boolean likedLocation;

    @Column(name = "liked_campus", nullable = true)
    private  Boolean likedCampus;

    @Column(name = "liked_atmosphere", nullable = true)
    private  Boolean likedAtmosphere;

    @Column(name = "liked_dorms", nullable = true)
    private  Boolean likedDorms;

    @Column(name = "liked_Sports", nullable = true)
    private  Boolean likedSports;
    
    @Column(name = "how_became_interested", nullable = true)
    private  String howBecameInterested;

    @Column(name = "recommending_school", nullable = true)
    private  String recommendingSchool;

    @Column(name = "additional_comments", nullable = true)
    private  String additionalComments;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getStreetAddress(){
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getZip(){
        return zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDateOfSurvey(){
        return dateOfSurvey;
    }

    public void setDateOfSurvey(String dateOfSurvey){
        this.dateOfSurvey = dateOfSurvey;
    }

    public Boolean getLikedStudents(){
        return likedStudents;
    }

    public void setLikedStudents(Boolean likedStudents){
        this.likedStudents = likedStudents;
    }

    public Boolean getLikedLocation(){
        return likedLocation;
    }

    public void setLikedLocation(Boolean likedLocation){
        this.likedLocation = likedLocation;
    }

    public Boolean getLikedCampus(){
        return likedCampus;
    }

    public void setLikedCampus(Boolean likedCampus){
        this.likedCampus = likedCampus;
    }

    public Boolean getLikedAtmosphere(){
        return likedAtmosphere;
    }

    public void setLikedAtmosphere(Boolean likedAtmosphere){
        this.likedAtmosphere = likedAtmosphere;
    }

    public Boolean getLikedDorms(){
        return likedDorms;
    }

    public void setLikedDorms(Boolean likedDorms){
        this.likedDorms = likedDorms;
    }

    public Boolean getLikedSports(){
        return likedSports;
    }

    public void setLikedSports(Boolean likedSports){
        this.likedSports = likedSports;
    }

    public String getHowBecameInterested(){
        return howBecameInterested;
    }

    public void setHowBecameInterested(String howBecameInterested){
        this.howBecameInterested = howBecameInterested;
    }

    public String getRecommendingSchool(){
        return recommendingSchool;
    }

    public void setRecommendingSchool(String recommendingSchool){
        this.recommendingSchool = recommendingSchool;
    }

    public String getAdditionalComments(){
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments){
        this.additionalComments = additionalComments;
    }
}
