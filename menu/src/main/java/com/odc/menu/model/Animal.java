package com.odc.menu.model;

public abstract class Animal {
    private String nom;
    private double taille;
    private String couleur;

    public Animal(String nom, double taille, String couleur){
        this.nom = nom;
        this.taille = taille;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public double getTaille() {
        return taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString(){
        return "Nom: " + this.nom + " Couleur: " + this.couleur + " Taille: " + this.taille;
    }
}
