package son.java.controller;

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
import son.java.model.Customer;
import son.java.model.Service;
import son.java.service.ServiceService;

import javax.validation.Valid;

@Controller
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/services")
    public ModelAndView listServices(@PageableDefault(value = 7)Pageable pageable){
        Page<Service> services = serviceService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("listService");
        modelAndView.addObject("services", services);
        return modelAndView;
    }

    @GetMapping("/service/create")
    public String create(Model model) {
        model.addAttribute("service", new Service());
        return "formService";
    }

    @GetMapping("/service/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("service", serviceService.findById(id));
        return "formService";
    }

    @PostMapping("/service/save")
    public String save(@Valid Service service, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "formService";
        }
        serviceService.save(service);
        redirect.addFlashAttribute("success", "Saved service successfully!");
        return "redirect:/services";
    }

    @GetMapping("/service/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        Service service = serviceService.findById(id);
        serviceService.delete(service);
        redirect.addFlashAttribute("success", "Deleted service successfully!");
        return "redirect:/services";
    }

    @GetMapping("/service/search")
    public String search(@RequestParam("s") String s, Model model, Pageable pageable) {
        if (s.equals("")) {
            return "redirect:/services";
        }

        model.addAttribute("services", serviceService.search(s, pageable));
        return "listService";
    }
}
