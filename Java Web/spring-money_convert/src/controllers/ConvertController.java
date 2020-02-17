package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
//    Đã xong
    @GetMapping("/convert")
    public String convert(@RequestParam(required = false,value = "usd") Float usd,@RequestParam(required = false, value = "rate") Float rate, Model model){
        if(usd==null||rate==null) {
            return "index";
        } else {
            float result = usd*rate;
            model.addAttribute("result1", result);
            return "submit";
        }
    }
//    @PostMapping("/usd")
//    public String submit(@RequestParam float usd, float rate, Model model){
//        float result = usd*rate;
//        model.addAttribute("result1", result);
//        return "submit";
//    }
}
