package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RomanNumeralController {

    private final CalculateRomanToArabic calculator;

    public RomanNumeralController(CalculateRomanToArabic calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam("romanNumeral") String romanNumeral, Model model) {
        try {
            int result = calculator.convert(romanNumeral);
            model.addAttribute("romanNumeral", romanNumeral);
            model.addAttribute("result", result);
        } catch (Exception e) {
            model.addAttribute("error", "Invalid Roman numeral");
        }
        return "index";
    }
}