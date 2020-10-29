package com.antek.informator;

import java.util.ArrayList;

public class Informator {
    public static void main(String... args) {
        Osoba antek = new Osoba("12345678910");
        Osoba hania = new Osoba("12345678345");
        Osoba anetta = new Osoba("82456213787");
        Osoba marcin = new Osoba("13467324958");
        ArrayList<Osoba> dzieci = new ArrayList<>();
        ArrayList<Osoba> rodzice = new ArrayList<>();

        antek.setImie("Antoni");
        antek.setNazwisko("Grabowski");
        antek.setMama(anetta);
        antek.setTata(marcin);

        hania.setImie("Hanna");
        hania.setNazwisko("Grabowska");
        hania.setMama(anetta);
        hania.setTata(marcin);

        anetta.setImie("Anetta");
        anetta.setNazwisko("Grabowska");
        anetta.setDzieci(antek);
        anetta.setDzieci(hania);

        marcin.setImie("Marcin");
        marcin.setNazwisko("Grabowski");
        anetta.setDzieci(dzieci);
        anetta.setDzieci(dzieci);

        System.out.println(antek);
        System.out.println(hania);
        System.out.println(anetta);
        System.out.println(marcin);

    }

}
