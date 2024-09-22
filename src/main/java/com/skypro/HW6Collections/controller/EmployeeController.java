package com.skypro.HW6Collections.controller;

import com.skypro.HW6Collections.employee.Employee;
import com.skypro.HW6Collections.service.EmployeeService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private  final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String welcome() {
        return "Welcome";
    }


    @GetMapping("/add")
    public Employee addEmployee(
            @RequestParam ("name") String name,
            @RequestParam ("lasName") String lastName
    ) {
        return   employeeService.addEmployee(name,lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(
            @RequestParam ("name") String name,
            @RequestParam ("lastName") String lastName
    ) {
        return employeeService.removeEmployee(name, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(
            @RequestParam ("name") String name,
            @RequestParam ("lastName") String lastName
    ) {
        return employeeService.findEmployee(name, lastName);
    }



    @GetMapping("/allEmployees")

    public List <Employee>  getAllEmployees() {

        return employeeService.getAllEmployees();
    }
}
