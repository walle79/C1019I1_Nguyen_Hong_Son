package h10s.son.controller;

import h10s.son.model.Customer;
import h10s.son.model.Phone;
import h10s.son.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @Autowired
    private PhoneService phoneService;
    @GetMapping("/phones")
    public ModelAndView listPhones(@PageableDefault(value = 5) Pageable pageable){
        Page<Phone> phones = phoneService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("listPhone");
        modelAndView.addObject("phones", phones);
        return modelAndView;
    }
    @GetMapping("/phone/create")
    public String create(Model model) {
        model.addAttribute("phone", new Phone());
        return "formPhone";
    }

    @GetMapping("/phone/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("phone", phoneService.findById(id));
        return "formPhone";
    }

    @PostMapping("/phone/save")
    public String save(@Valid Phone phone, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "formPhone";
        }
        phoneService.save(phone);
        redirect.addFlashAttribute("success", "Saved phone successfully!");
        return "redirect:/phones";
    }

    @GetMapping("/phone/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        Phone phone = phoneService.findById(id);
        phoneService.delete(phone);
        redirect.addFlashAttribute("success", "Deleted phone successfully!");
        return "redirect:/phones";
    }

    @GetMapping("/phone/search")
    public String search(@RequestParam("s") String s, Model model, Pageable pageable) {
        if (s.equals("")) {
            return "redirect:/phones";
        }
        model.addAttribute("phones", phoneService.search(s, pageable));
        return "listPhone";
    }
}
