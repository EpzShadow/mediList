package com.example.medicalapp;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int generalState;
    private int heartRate;
    private int breathing;
    private int longevity;
    public Person(String firstName, String lastName, String age, int a, int b, int c, int d){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Integer.parseInt(age);
        generalState = a;
        heartRate = b;
        breathing = c;
        longevity = d;

    }
    public Person(){

    }

    public int getGeneralState() {
        return generalState;
    }

    public void setGeneralState(int generalState) {
        this.generalState = generalState;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBreathing() {
        return breathing;
    }

    public void setBreathing(int breathing) {
        this.breathing = breathing;
    }

    public int getLongevity() {
        return longevity;
    }

    public void setLongevity(int longevity) {
        this.longevity = longevity;
    }
}


