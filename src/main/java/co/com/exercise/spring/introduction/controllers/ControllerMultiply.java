package co.com.exercise.spring.introduction.controllers;

import co.com.exercise.spring.introduction.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMultiply {

    @Autowired
    private Calculator calculator;

    public ControllerMultiply(){
        System.out.println("Creating Controller Multiply");
    }

    @GetMapping("/multiply")
    public String multiplicar() {
        int a = 5;
        int b = 10;

        return "El resultado de la suma de " + a + " y " + b + " es : " + calculator.multiply(a, b);
    }
}
