package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String convert(){
        return "index";
    }

    @PostMapping("/convert1")
    public String convert1(@RequestParam int rate, int usd, Model model){
        int result = rate*usd;
        model.addAttribute("result", result);
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        return "result";
    }
}
