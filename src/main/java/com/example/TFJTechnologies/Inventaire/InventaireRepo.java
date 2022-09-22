package com.example.TFJTechnologies.Inventaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InventaireRepo extends JpaRepository<Inventaire,Integer> {

    // n'est pas terminéé
    @Query(value = "SELECT nom,count(material_id) from Inventaire natural join Material")
    public List<Inventaire> findquantite();
}
