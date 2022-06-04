package com.example.exercice1;

import java.io.Serializable;

public class Country implements Serializable {

    private String nom;
    private double population;
    private String capital;
    private String continent;
    private int image;

    public Country() {
    }

    public Country(String nom,String capital, double population, String continent, int image) {
        this.nom = nom;
        this.capital = capital;
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
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
