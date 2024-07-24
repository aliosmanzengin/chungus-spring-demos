package com.azengin.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    // expose a new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hola Todos";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a 5k";
    }

    // expose a new endpoint for "fortuna"
    @GetMapping("/fortune")
    public String getFortune() {
        return "    Fortuna desperata\n" +
                "    Iniqua e maledecta\n" +
                "    Che de tal dona electa\n" +
                "    La fama hai denigrata.";
    }

}
