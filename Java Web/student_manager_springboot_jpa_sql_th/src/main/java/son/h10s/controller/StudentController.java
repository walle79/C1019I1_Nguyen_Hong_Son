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
import son.h10s.model.Student;
import son.h10s.service.StudentService;

import javax.validation.Valid;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public ModelAndView listStudents(@PageableDefault(value = 5)Pageable pageable){
        Page<Student> students = studentService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("students", students);
        return modelAndView;
    }
    @GetMapping("/student/create")
    public String create(Model model){
        model.addAttribute("student", new Student());
        return "form";
    }
    @GetMapping("/student/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "form";
    }

    @PostMapping("/student/save")
    public String save(@Valid Student student, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        studentService.save(student);
        redirect.addFlashAttribute("success", "Saved student successfully!");
        return "redirect:/students";
    }

    @GetMapping("/student/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        Student student = studentService.findById(id);
        studentService.delete(student);
        redirect.addFlashAttribute("success", "Deleted student successfully!");
        return "redirect:/students";
    }

    @GetMapping("/student/search")
    public String search(@RequestParam("s") String s, Model model, Pageable pageable) {
        if (s.equals("")) {
            return "redirect:/students";
        }
        model.addAttribute("students", studentService.search(s, pageable));
        return "list";
    }

}
