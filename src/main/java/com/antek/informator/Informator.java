package com.antek.informator;

import java.util.ArrayList;

public class Informator {
    public static void main(String... args) {
        Osoba antek = new Osoba("12345678910");
        Osoba hania = new Osoba("12345678345");
        Osoba anetta = new Osoba("82456213787");
        Osoba marcin = new Osoba("13467324958");
        Osoba toska = new Osoba("29576392513");


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
        anetta.setDzieci(new ArrayList<>());
        anetta.getDzieci().add(antek);
        anetta.getDzieci().add(hania);
        anetta.getDzieci().add(toska);


        marcin.setImie("Marcin");
        marcin.setNazwisko("Grabowski");
        marcin.setDzieci(new ArrayList<>());
        marcin.getDzieci().add(antek);
        marcin.getDzieci().add(hania);

        System.out.println(antek);
        System.out.println(hania);
        System.out.println(anetta);
        System.out.println(marcin);

    }

}
