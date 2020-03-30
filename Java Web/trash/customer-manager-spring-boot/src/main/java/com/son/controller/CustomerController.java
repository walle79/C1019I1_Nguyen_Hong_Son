package com.son.controller;

import com.son.model.Customer;
import com.son.service.CustomerService;
import com.son.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/")
    public ModelAndView getAll(){
        return new ModelAndView("index","customers",customerService.findAll());
    }
    @GetMapping("/addCustomer")
    public ModelAndView addCustomer(){
        return new ModelAndView("create", "customer", new Customer());
    }
    @PostMapping("/addCustomer")
    public String addCustomer(Customer customer, RedirectAttributes redirectAttributes){
        customer.setId((int) (Math.random()*1000));
        customerService.add(customer);
        redirectAttributes.addFlashAttribute("mess","Chúc mừng bạn đã thêm thành công!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }
    @PostMapping("/customer/edit")
    public String editCustomer(Customer customer, RedirectAttributes redirectAttributes){
        customerService.update(customer.getId(),customer);
        redirectAttributes.addFlashAttribute("mess","Chúc mừng bạn đã sửa thông tin thành công!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "delete";
    }
    @PostMapping("/customer/delete")
    public String deleteCustomer(Customer customer, RedirectAttributes redirectAttributes){
        customerService.delete(customer.getId());
        redirectAttributes.addFlashAttribute("mess","Chúc mừng bạn đã xóa thông tin thành công!");
        return "redirect:/";
    }
    @GetMapping("/customer/{id}/view")
    public String viewCustomer(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }
    @GetMapping("/customer/search")
    public String search(@RequestParam("search") String search, Model model){
        if(search.equals("")){
            return "redirect:/";
        }
        model.addAttribute("customers", customerService.search(search));
        return "index";
    }
}
