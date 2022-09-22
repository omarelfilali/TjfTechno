package com.example.TFJTechnologies.Employe;

import com.example.TFJTechnologies.Magasin.Magasin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employe_id;
    String nom;
    String prenom;
    String image_url;
    String email;
    String login;
    String mdp;
    boolean actif;


    Timestamp updated_date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "magasin_id",referencedColumnName = "magasin_id")
    Magasin magasin;

    @OneToOne(mappedBy = "Directeur")
    Magasin magasinGeree;

    public int getEmploye_id() {
        return employe_id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public boolean isActif() {
        return actif;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }
}
