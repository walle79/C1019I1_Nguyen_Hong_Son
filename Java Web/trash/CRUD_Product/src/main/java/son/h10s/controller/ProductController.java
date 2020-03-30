package son.h10s.controller;

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
import son.h10s.model.Product;
import son.h10s.service.ProductService;

import javax.validation.Valid;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ModelAndView listCustomers(@PageableDefault(value = 7) Pageable pageable){
        Page<Product> products = productService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }


    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "form";
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "form";
    }

    @PostMapping("/product/save")
    public String save(@Valid Product product, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        productService.save(product);
        redirect.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/products";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        Product product = productService.findById(id);
        productService.delete(product);
        redirect.addFlashAttribute("success", "Deleted product successfully!");
        return "redirect:/products";
    }

    @GetMapping("/product/search")
    public String search(@RequestParam("s") String s, Model model, Pageable pageable) {
        if (s.equals("")) {
            return "redirect:/products";
        }
        model.addAttribute("products", productService.search(s, pageable));
        return "list";
    }
}
