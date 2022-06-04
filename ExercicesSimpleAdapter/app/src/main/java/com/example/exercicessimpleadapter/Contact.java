package com.example.exercicessimpleadapter;

import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {

    private int image;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private Date dateNaissance;

    public Contact() {
    }

    public Contact(int image, String nom, String prenom, String tel, String email, Date dateNaissance) {
        this.image = image;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
