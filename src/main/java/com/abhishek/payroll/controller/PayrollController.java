package com.abhishek.payroll.controller;

import com.abhishek.payroll.entity.Department;
import com.abhishek.payroll.service.PayrollService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class PayrollController {
    @Autowired
    private PayrollService payrollService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("got request to save department");
        return payrollService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("request for getting department with ID: "+departmentId);
        return payrollService.findDepartmentById(departmentId);
    }
}
