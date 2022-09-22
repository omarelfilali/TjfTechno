package com.example.TFJTechnologies.Magasin;

import com.example.TFJTechnologies.Employe.Employe;
import com.example.TFJTechnologies.Inventaire.Inventaire;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int magasin_id;
    String ville;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Directeur_id", referencedColumnName = "employe_id")
    Employe Directeur ;

    @OneToMany(mappedBy = "magasin")
    Set<Employe> employes= new HashSet<>();
    Timestamp updated_date;

    @OneToMany(mappedBy = "magasin", cascade = CascadeType.ALL)
    Set<Inventaire> bookPublishers = new HashSet<>();


    public String getVille() {
        return ville;
    }

    public Employe getDirecteur() {
        return Directeur;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setDirecteur(Employe directeur) {
        Directeur = directeur;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }
    public int getMagasin_id() {
        return magasin_id;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "magasin_id=" + magasin_id +
                ", ville='" + ville + '\'' +
                ", Directeur=" + Directeur +
                ", updated_date=" + updated_date +
                '}';
    }
}
