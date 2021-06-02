package org.svirid.controller;

import org.svirid.model.entity.Patient;
import org.svirid.model.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping("/createNewPatient")
    public String createNewPatient (Model model){
        Patient newPatient = new Patient();
        model.addAttribute("newPatient",newPatient);
        return "show-new-patient";
    }

    @RequestMapping("/createdPatient")
    public String createPatient(@ModelAttribute("newPatient") Patient patient){
        patientService.createPatient(patient);

        return "redirect:/allPatients";
    }

}
