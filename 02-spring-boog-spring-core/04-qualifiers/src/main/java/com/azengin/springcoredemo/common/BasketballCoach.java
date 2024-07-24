package com.azengin.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice tourniques";
    }
}
