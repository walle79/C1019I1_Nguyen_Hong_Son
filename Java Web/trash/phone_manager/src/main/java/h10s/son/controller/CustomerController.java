package h10s.son.controller;

import h10s.son.model.Customer;
import h10s.son.service.CustomerService;
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
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public ModelAndView listCustomers(@PageableDefault(value = 5)Pageable pageable){
        Page<Customer> customers = customerService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "form";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "form";
    }

    @PostMapping("/customer/save")
    public String save(@Valid Customer customer, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        customerService.save(customer);
        redirect.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/customers";
    }

    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        Customer customer = customerService.findById(id);
        customerService.delete(customer);
        redirect.addFlashAttribute("success", "Deleted customer successfully!");
        return "redirect:/customers";
    }

    @GetMapping("/customer/search")
    public String search(@RequestParam("s") String s, Model model, Pageable pageable) {
        if (s.equals("")) {
            return "redirect:/customers";
        }
        model.addAttribute("customers", customerService.search(s, pageable));
        return "list";
    }
}
