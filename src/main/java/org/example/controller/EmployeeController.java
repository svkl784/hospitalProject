package org.example.controller;

import org.example.model.dao.EmployeeDao;
import org.example.model.entity.Employee;
import org.example.model.service.EmployeeService;
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
