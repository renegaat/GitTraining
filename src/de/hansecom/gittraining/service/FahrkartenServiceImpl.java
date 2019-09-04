package de.hansecom.gittraining.service;

import de.hansecom.gittraining.domain.Fahrkarte;

public class FahrkartenServiceImpl implements FahrkartenService {
    @Override
    public Fahrkarte erzeugeFahrKarte(double preis, String name) {
        return new Fahrkarte(preis,name);
    }
}
