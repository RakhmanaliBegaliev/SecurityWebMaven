package com.peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping
    public String employee() {
        return "employees";
    }

    @GetMapping("hr")
    public String hr() {
        return "hr";
    }

    @GetMapping("managerInfo")
    public String manager() {
        return "managerInfo";
    }
}
