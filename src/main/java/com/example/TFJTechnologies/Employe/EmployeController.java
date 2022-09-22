package com.example.TFJTechnologies.Employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    @Autowired
    EmployeRepo employeRepo;


    @PostMapping("/save")
    Employe saveEmploye(@RequestBody Employe emp){
        return employeRepo.save(emp);
    }
}
