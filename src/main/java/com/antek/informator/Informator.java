package com.antek.informator;

public class Informator {
    public static void main(String args) {
        Osoba antek = new Osoba("12345678910");
        Osoba hania = new Osoba("12345678345");
        Osoba anetta = new Osoba("82456213787");
        Osoba marcin = new Osoba("13467324958");
        antek.setImie("Antoni");
        antek.setNazwisko("Grabowski");
        antek.setMama(anetta);

    }

}
