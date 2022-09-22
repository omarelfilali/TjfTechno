package com.example.TFJTechnologies.Magasin;

import com.example.TFJTechnologies.Employe.Employe;
import com.example.TFJTechnologies.Employe.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/magasins")
public class MagasinController {
    @Autowired
   Magasinrepo magasinrepo;


    @PostMapping("/save")
    Magasin saveMagasin(@RequestBody Magasin m){
        return magasinrepo.save(m);
    }
}
