package com.calculator.Calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @GetMapping("/collect")
    public int sum(@RequestParam int v1, @RequestParam int v2){

        return  v1+ v2;

    }


}
