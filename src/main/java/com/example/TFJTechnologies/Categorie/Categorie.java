package com.example.TFJTechnologies.Categorie;

import com.example.TFJTechnologies.Material.Material;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Categorie {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categorie_id;
    String nom ;

    @OneToMany(mappedBy = "categorie")
    Set<Material>  materials= new HashSet<>();
    Timestamp updated_date;

    public String getNom() {
        return nom;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "categorie_id=" + categorie_id +
                ", nom='" + nom + '\'' +
                ", updated_date=" + updated_date +
                '}';
    }
}
