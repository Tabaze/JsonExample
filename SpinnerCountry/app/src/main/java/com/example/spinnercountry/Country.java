package com.example.spinnercountry;

import android.media.Image;

import java.io.Serializable;

public class Country implements Serializable {

    private String nom;
    private double population;
    private String continent;
    private int image;

    public Country() {
    }

    public Country(String nom, double population, String continent, int image) {
        this.nom = nom;
        this.population = population;
        this.continent = continent;
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


