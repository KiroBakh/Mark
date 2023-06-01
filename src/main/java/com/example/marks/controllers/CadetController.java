package com.example.marks.controllers;

import com.example.marks.models.Cadet;
import com.example.marks.repository.CadetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CadetController {
    @Autowired
    private CadetRepo cadetRepo;

    @GetMapping("/")
    public String getAllCadet(Model model) {
        List<Cadet> cadets = cadetRepo.findAll();
        model.addAttribute("cadets", cadets);
        return "index";
    }

    @PostMapping(value = "/add")
    public String saveProduct(@ModelAttribute("cadet") Cadet cadet) {
        cadetRepo.save(cadet);
        return "redirect:/";
    }
}
