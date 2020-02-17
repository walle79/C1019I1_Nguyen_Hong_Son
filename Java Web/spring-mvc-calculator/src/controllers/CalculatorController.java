package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(){
        return "index";
    }
    @PostMapping("/cal")
    public String cal(@RequestParam float first, float second, String button, Model model){
        float res = 0;
        switch (button){
            case "Addition(+)":
                 res = first + second;
                 break;
            case "Subtraction(-)":
                 res = first - second;
                 break;
            case "Multiplication(x)":
                 res = first*second;
                break;
            case "Division(/)":
                if(second != 0){
                     res = first/second;
                } else {
                    throw new RuntimeException("Divine by zero");
                }
                break;
        }
        model.addAttribute("result", res);
        return "index";
    }

}
