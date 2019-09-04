package de.hansecom.gittraining.domain;

import java.util.Objects;

public class Fahrkarte {
    public double preis;
    public String name;

    public Fahrkarte(double preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrkarte fahrkarte = (Fahrkarte) o;
        return Double.compare(fahrkarte.preis, preis) == 0 &&
                Objects.equals(name, fahrkarte.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preis, name);
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
