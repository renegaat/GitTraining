package de.hansecom.gittraining.domain;

public class Fahrkartenautomat {
    private Integer id;

    public Fahrkartenautomat(Integer id){
        this.id = id;
    }

    public Fahrkartenautomat(){
        this(42);
    }
}
