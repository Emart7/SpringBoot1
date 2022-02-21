package co.com.exercise.spring.introduction.controllers;

import co.com.exercise.spring.introduction.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDivide {

    @Autowired
    private Calculator calculator;

    public ControllerDivide(){
        System.out.println("Creating Controller Divide");
    }

    @GetMapping("/divide")
    public String dividir(){
        int a = 10;
        int b = 2;

        return "El resultado de la dividir " + a + " y " + b + " es : " + calculator.divide(a,b);
    }
}
