package com.example.TFJTechnologies.Inventaire;

import com.example.TFJTechnologies.Magasin.Magasin;
import com.example.TFJTechnologies.Material.Material;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Inventaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventaire_id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "material_id")
    Material material;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "magasin_id")
    Magasin magasin ;

    Timestamp updated_date;


    public Material getMaterial() {
        return material;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public Timestamp getUpdated_date() {
        return updated_date;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public void setUpdated_date(Timestamp updated_date) {
        this.updated_date = updated_date;
    }

    public int getInventaire_id() {
        return inventaire_id;
    }

    @Override
    public String toString() {
        return "Inventaire{" +
                "inventaire_id=" + inventaire_id +
                ", material=" + material +
                ", magasin=" + magasin +
                ", updated_date=" + updated_date +
                '}';
    }
}
