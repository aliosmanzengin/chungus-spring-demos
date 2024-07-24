package com.azengin.springcoredemo.rest;

import com.azengin.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //    Define a private field for dependency
    private Coach myCoach;

    // Alternatively, you may use any method to inejct. does not have to be setter or constructor.
    // Just use @Autowired annotation
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
