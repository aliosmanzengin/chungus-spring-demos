package com.azengin.springcoredemo.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //marks the class as a Bean for dependency injection
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("in constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 15 minutes";
    }
}