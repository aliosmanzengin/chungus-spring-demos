package com.azengin.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component //marks the class as a Bean for dependency injection
public class VolleyballCoach implements Coach{

    public VolleyballCoach() {
        System.out.println("in constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice serves tactics";
    }
}
