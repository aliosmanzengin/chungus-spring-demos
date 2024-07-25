package com.azengin.springcoredemo.rest;

import com.azengin.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public void DemoController(
            @Qualifier("footballCoach") Coach theCoach,
            @Qualifier("footballCoach") Coach theAnotherCoach
    ) {
        System.out.println("in constructor:" + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing benas: myCoach == anotherCoach ? " + (myCoach == anotherCoach);
        //false for PROTOTYPE, True for SINGLETON
    }
}
