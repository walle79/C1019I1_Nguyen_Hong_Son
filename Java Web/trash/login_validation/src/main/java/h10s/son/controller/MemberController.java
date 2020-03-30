package h10s.son.controller;

import h10s.son.model.Member;
import h10s.son.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/member")
    public String index(Model model) {
        model.addAttribute("members", memberService.findAll());
        return "member";
    }

    @GetMapping("/register")
    public String create(Model model) {
        model.addAttribute("member", new Member());
        return "register";
    }

    @PostMapping("/save")
    public String save(@Valid Member member, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "register";
        }
        memberService.save(member);
        redirect.addFlashAttribute("success", "Saved member successfully!");
        return "redirect:/member";
    }

}
