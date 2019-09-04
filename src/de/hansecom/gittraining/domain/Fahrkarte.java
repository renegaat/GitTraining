package de.hansecom.gittraining.domain;

public class Fahrkarte {
    public double preis;
    public String name;

    public Fahrkarte(double preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Preis:  " + preis + " Name: " + name + "Ende";
    }

    public double getPreis() {
        return preis + 20;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
