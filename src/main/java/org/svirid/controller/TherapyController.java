package org.svirid.controller;

import org.svirid.model.entity.Therapy;
import org.svirid.model.service.TherapyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TherapyController {
    @Autowired
    private TherapyService therapyService;

    @RequestMapping("/allTherapy")
    public String showAllTherapy(Model model) {
        List<Therapy> allTherapy = therapyService.getAllTherapy();
        model.addAttribute("allTherapy",allTherapy);
        return "all-therapy";
    }
}
