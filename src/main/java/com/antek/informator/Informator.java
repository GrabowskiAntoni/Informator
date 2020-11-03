package com.antek.informator;

import java.io.*;
import java.util.ArrayList;

public class Informator {
    public static void main(String... args) throws IOException {
        System.out.println("Witaj\nWybierz opcje:\n1 - Wyświetl osoby\n2 - Rejestruj osobe\nAby zakonczyc program wpisz exit");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line = buffer.readLine();
        while(!line.equals("exit")){
            String opcja = buffer.readLine();
            if(opcja.equals("1")) {
                System.out.println("Tutaj wyświetlimy osoby");
            }
            if(opcja.equals("2")) {
                System.out.println("Tutaj rejestrujemy osobe");
            }
            if(opcja.equals("exit")) break;
        }
        System.exit(0);
//            Osoba antek = new Osoba("12345678910");
//            Osoba hania = new Osoba("12345678345");
//            Osoba anetta = new Osoba("82456213787");
//            Osoba marcin = new Osoba("13467324958");
//            Osoba toska = new Osoba("29576392513");
//
//
//            antek.setImie("Antoni");
//            antek.setNazwisko("Grabowski");
//            antek.setMama(anetta);
//            antek.setTata(marcin);
//
//            hania.setImie("Hanna");
//            hania.setNazwisko("Grabowska");
//            hania.setMama(anetta);
//            hania.setTata(marcin);
//
//            anetta.setImie("Anetta");
//            anetta.setNazwisko("Grabowska");
//            anetta.setDzieci(new ArrayList<>());
//            anetta.getDzieci().add(antek);
//            anetta.getDzieci().add(hania);
//            anetta.getDzieci().add(toska);
//
//
//            marcin.setImie("Marcin");
//            marcin.setNazwisko("Grabowski");
//            marcin.setDzieci(new ArrayList<>());
//            marcin.getDzieci().add(antek);
//            marcin.getDzieci().add(hania);
//
//            System.out.println(antek);
//            System.out.println(hania);
//            System.out.println(anetta);
//            System.out.println(marcin);



    }
}
