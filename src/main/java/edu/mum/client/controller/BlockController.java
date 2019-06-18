package edu.mum.client.controller;

import edu.mum.client.domain.Block;
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
@RequestMapping("/blocks")
public class BlockController {

    @GetMapping("/add")
    public String add(@Valid @ModelAttribute Block block) {
        System.out.println("blocks/block_add");
        return "blocks/block_add";
    }

    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Block block, RedirectAttributes redirectAttributes, BindingResult result, Model model){
        String result_str = "saved";
        if (result.hasErrors()){
            return "blocks/block_add";

        }
        redirectAttributes.addFlashAttribute("block", block);
        model.addAttribute("result", result_str);
        return "redirect:list";




    }



}
