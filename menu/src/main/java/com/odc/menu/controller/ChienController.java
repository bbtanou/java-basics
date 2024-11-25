package com.odc.menu.controller;

import java.util.ArrayList;
import java.util.List;

import com.odc.menu.model.Chien;

public class ChienController {
    private List<Chien> chiens = new ArrayList<>();

    public Chien create(String nom, double taille, String couleur){
        var chien = new Chien(nom, taille, couleur);
        chiens.add(chien);
        return chien;
    }


    public List<Chien> getAll(){
        return chiens;
    }
}
