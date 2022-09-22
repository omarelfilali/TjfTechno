package com.example.TFJTechnologies.Material;

import com.example.TFJTechnologies.Magasin.Magasin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Materiels")
public class MaterielController {

    @Autowired
    MaterialRepo materialRepo;



    @GetMapping
    List<Material> getMateriels(){
        return materialRepo.findAll();

    }

    @PostMapping
    Material saveMateriel(@RequestBody Material m){
        return materialRepo.save(m);

    }

    @PutMapping(("/update/{materield}/Description/{Description}"))
    Material updateMateriel(@PathVariable int materield ,@PathVariable String description){

        Material m = materialRepo.findById(materield).get();
        m.setDescription(description);
        return  m ;

    }

    @PutMapping(("/delete/{materield}"))
    String deleteMateriel(@PathVariable int materield){

         materialRepo.deleteById(materield);

        return  "deleted" ;

    }



}
