package edu.mum.client.controller;

import edu.mum.client.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("students")
public class StudentController {
    @GetMapping("/add")
    public String add(@ModelAttribute Student student, Model model){
        System.out.println("students/student_add");
        return "students/student_add";
    }

    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Student student, BindingResult result, RedirectAttributes redirectAttributes, Model model){
        if(result.hasErrors()){
            return "students/student_add";
        }
        String result_str = "save";
        redirectAttributes.addFlashAttribute("student", student);
        redirectAttributes.addFlashAttribute("result", result_str);
        return "redirect:list";
    }


}
