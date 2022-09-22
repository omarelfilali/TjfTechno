package com.example.TFJTechnologies.Categorie;

import com.example.TFJTechnologies.Magasin.Magasin;
import com.example.TFJTechnologies.Magasin.Magasinrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping
    List<Categorie> getMagasins(){
        return categoryRepo.findAll();
    }

    @PostMapping
    Categorie saveMagasin(@RequestBody Categorie c){
        return categoryRepo.save(c);
    }
}
