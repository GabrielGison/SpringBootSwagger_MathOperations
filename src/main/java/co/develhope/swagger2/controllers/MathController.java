package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/math")                                //Welcome Message
    public String welcomeMathMsg(){
    return "Welcome to Math Web!";
    }

    @GetMapping("/math/division-info")                  //Get Divison Operation's Info
    public String divisionInfo(){
        return new ArithmeticOperation(
                "Division",
                2,
                "dividend / divisor = quotient",
                new String[]{"Invariant","Distributive"}
        ).toString();
    }

    @GetMapping("/math/multiplication")                 //Get a Simple Multiplication of Integers
    public String multiplicate(){
        int firstInt = 3;
        int secondInt = 6;
        int multiInt = firstInt * secondInt;
        return firstInt + " x " + secondInt + " = " + multiInt;
    }

    @GetMapping("/math/square/{n}")                          //Get the square of a Path Variable Integer
    public String square(@PathVariable int n){
        int square = n * n;
        return "Il quadrato di " + n + " è " + square + "!";
    }
}
