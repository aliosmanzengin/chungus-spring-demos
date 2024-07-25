package com.azengin.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("in constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice field markage";
    }
}
