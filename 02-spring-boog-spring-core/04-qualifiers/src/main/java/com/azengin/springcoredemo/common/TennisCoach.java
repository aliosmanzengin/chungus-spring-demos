package com.azengin.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component //marks the class as a Bean for dependency injection
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice backhend volley";
    }
}
