package com.example.TFJTechnologies.Material;

import com.example.TFJTechnologies.Categorie.Categorie;
import com.example.TFJTechnologies.Inventaire.Inventaire;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Material")
public class Material {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    int material_id ;
    @Column(columnDefinition = "varchar(255)")
    String nom;
    @Column(columnDefinition = "TEXT",nullable = true)
    String description;
    String marque;
    @Column(nullable = true)
    String image_url;
    Taille taille ;
    int duree_location;
    Double cout_location;
    Double cout_remplacant;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categorie_id",referencedColumnName = "categorie_id")
    Categorie categorie;
    Timestamp updated_date;


    @OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
    Set<Inventaire> bookPublishers = new HashSet<>();

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getMarque() {
        return marque;
    }

    public String getImage_url() {
        return image_url;
    }

    public Taille getTaille() {
        return taille;
    }

    public int getDuree_location() {
        return duree_location;
    }

    public Double getCout_location() {
        return cout_location;
    }

    public Double getCout_remplacant() {
        return cout_remplacant;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public void setDuree_location(int duree_location) {
        this.duree_location = duree_location;
    }

    public void setCout_location(Double cout_location) {
        this.cout_location = cout_location;
    }

    public void setCout_remplacant(Double cout_remplacant) {
        this.cout_remplacant = cout_remplacant;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }

    public int getMaterial_id() {
        return material_id;
    }

    @Override
    public String toString() {
        return "Material{" +
                "material_id=" + material_id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", marque='" + marque + '\'' +
                ", image_url='" + image_url + '\'' +
                ", taille=" + taille +
                ", duree_location=" + duree_location +
                ", cout_location=" + cout_location +
                ", cout_remplacant=" + cout_remplacant +
                ", categorie=" + categorie +
                ", updated_date=" + updated_date +
                '}';
    }
}
enum Taille {
    petit,
    moyene,
    grand
}