package com.example.TFJTechnologies.Inventaire;

import com.example.TFJTechnologies.Material.Material;
import com.example.TFJTechnologies.Material.MaterialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventaire")
public class InventaireController {

    @Autowired
    InventaireRepo inventaireRepo;

    @Autowired
    MaterialRepo materialRepo;


    @GetMapping
    List<Inventaire> getInventaire(){
        return inventaireRepo.findAll();

    }

    @PostMapping
    Inventaire saveInventaire(@RequestBody Inventaire i){
        return inventaireRepo.save(i);

    }

    @PutMapping(("/update/inventaireID/{inventairld}/matriel_id/{matriel_id}"))
    Inventaire updateInventaire(@PathVariable int inventairld ,@PathVariable int matriel_id){

        Inventaire inv = inventaireRepo.findById(inventairld).get();
        Material   mat=materialRepo.findById(matriel_id).get();

          inv.setMaterial(mat);
        return  inv ;

    }

    @PutMapping(("/delete/{invid}"))
    String deleteInventaire(@PathVariable int invid){

        inventaireRepo.deleteById(invid);

        return  "deleted" ;

    }

    
}
