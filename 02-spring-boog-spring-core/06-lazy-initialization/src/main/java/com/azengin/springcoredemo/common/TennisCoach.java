package com.azengin.springcoredemo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component //marks the class as a Bean for dependency injection
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("in constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhend volley";
    }
}
