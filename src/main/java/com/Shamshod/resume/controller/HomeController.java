package com.Shamshod.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Shaxsiy ma'lumotlar
        model.addAttribute("name", "Odinayev Shamshod");
        model.addAttribute("title", "");
        model.addAttribute("aboutMe", "I am a Java developer, mostly working on my own projects to improve my skills. Additionally, I am learning English.");

        // Ta'lim
        List<Education> education = Arrays.asList(
                new Education("Tashkent University of Information Technologies named after Muhammad ibn Musa al-Khwarizmi", "Telecommunication", "2022-2026")
        );
        model.addAttribute("education", education);

        // Kontakt
        model.addAttribute("email", "shamshododinayev1702@gmail.com");
        model.addAttribute("phone", "+998 91 082 66 96");
        model.addAttribute("instagram", "https://instagram.com/shamshod_1702");
        model.addAttribute("github", "https://github.com/ShamshodOdinayev");

        return "index";
    }
}

class Education {
    private String institution;
    private String degree;
    private String years;

    public Education(String institution, String degree, String years) {
        this.institution = institution;
        this.degree = degree;
        this.years = years;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDegree() {
        return degree;
    }

    public String getYears() {
        return years;
    }
}