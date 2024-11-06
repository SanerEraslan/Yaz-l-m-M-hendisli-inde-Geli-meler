package com.calculator.Calculator;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @GetMapping("/collect")
    public int collect(@RequestParam int v1, @RequestParam int v2){

        return  v1+ v2;

    }

    @PostMapping("multiply")
    public int multiply(@RequestParam int v1 ,@RequestParam int v2){

        return v1*v2;

    }

}
