package de.hansecom.gittraining.service;

import de.hansecom.gittraining.domain.Fahrkarte;

public interface FahrkartenService {
    public Fahrkarte erzeugeFahrKarte (double preis, String name);
}
