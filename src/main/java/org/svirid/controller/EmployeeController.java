package org.svirid.controller;

import org.svirid.model.entity.Employee;
import org.svirid.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/allEmployees")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployee();
        model.addAttribute("allEmployees", allEmployees);
        return "all-employees";
    }
}
