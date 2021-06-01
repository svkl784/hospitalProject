package org.example.controller;

import org.example.model.entity.Employee;
import org.example.model.entity.Patient;
import org.example.model.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;

    @RequestMapping("/allPatients")
    public String showAllPatients(Model model) {
        List<Patient> allPatients = patientService.getAllPatient();
        model.addAttribute("allPatients", allPatients);
        return "all-patients";
    }

}
