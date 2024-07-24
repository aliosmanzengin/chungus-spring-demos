package com.azengin.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component //marks the class as a Bean for dependency injection
public class FootballtCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 15 minutes";
    }
}
