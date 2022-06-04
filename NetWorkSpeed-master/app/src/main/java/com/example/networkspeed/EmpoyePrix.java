package com.example.networkspeed;

public class EmpoyePrix {
    String fonction;
    double prixNormal,prixSupp,prime;
    public double getPrixNormal() {
        return prixNormal;
    }

    public void setPrixNormal(double prixNormal) {
        this.prixNormal = prixNormal;
    }

    public double getPrixSupp() {
        return prixSupp;
    }

    public void setPrixSupp(double prixSupp) {
        this.prixSupp = prixSupp;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public String getFoction() {
        return fonction;
    }

    public void setFoction(String foction) {
        this.fonction = foction;
    }

    public EmpoyePrix() {
    }

    public EmpoyePrix(String foction, double prixNormal, double prixSupp, double prime) {
        this.fonction = foction;
        this.prixNormal = prixNormal;
        this.prixSupp = prixSupp;
        this.prime = prime;
    }
}
