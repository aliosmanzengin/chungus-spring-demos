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

    // define init method
    @PostConstruct
    public void doStartupBasketball() {
        System.out.println("In doStartupBasketball() : " + getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void doClanupBasketball() {
        System.out.println("In doClanupBasketball() : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice field markage";
    }
}
