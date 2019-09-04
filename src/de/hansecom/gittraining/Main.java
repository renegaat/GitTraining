package de.hansecom.gittraining;

import de.hansecom.gittraining.domain.Fahrkarte;
import de.hansecom.gittraining.service.FahrkartenServiceImpl;

public class Main {

    public static void main(String[] args) {
        FahrkartenServiceImpl fahrkartenService = new FahrkartenServiceImpl();
        Fahrkarte meineFahrKarte = fahrkartenService.erzeugeFahrKarte(2, "Meine Fahrkarte");

        System.out.println(meineFahrKarte.toString());
    }
}
