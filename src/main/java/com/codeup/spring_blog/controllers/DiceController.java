package com.codeup.spring_blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    @GetMapping("roll-dice")
    public String diceStart(){
        return "rollDiceView";
    }

    @GetMapping("roll-dice/{number}")
    public String rollDice(@PathVariable int number, Model model) {
        int randomNum = (int)Math.floor(Math.random()*(6-1+1)+1);

        String message = "";

        if(randomNum == number){
            message = "You guessed correctly";
        }else{
            message = "That is a wrong number";
        }
        System.out.println("message = " + message);
        System.out.println("What did we get? Random number = " + randomNum + "; userNumber = " + number);
        model.addAttribute("number", number);
        return "rollDiceView";
    }
}
