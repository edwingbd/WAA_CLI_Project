package edu.mum.client.controller;

import edu.mum.client.domain.Entry;
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
@RequestMapping("/entries")
public class EntryController {
    @GetMapping("/add")
    public String add(@ModelAttribute Entry entry){
        System.out.println("entries/entry_add");
        return "entries/entry_add";
    }
    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Entry entry, BindingResult result, Model model, RedirectAttributes redirectAttributes){
        String result_str = "saved";
        if(result.hasErrors()){
            return "entries/entry_add";
        }
        redirectAttributes.addFlashAttribute("entry", entry);
        model.addAttribute("result", result_str);
        return "redirect_list";




    }

}
