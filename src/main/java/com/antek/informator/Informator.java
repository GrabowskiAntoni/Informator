package com.antek.informator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Informator {
    public static HashMap<String, Osoba> personByPesel = new HashMap<>();
    public static void main(String... args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Witaj\nWybierz opcje:\n1 - Wyświetl osoby\n2 - Rejestruj osobe\n3 - Pokaż wszystko\nAby zakonczyc program wpisz exit");
            String line = buffer.readLine();
            switch(line){
                case "1":
                    System.out.println("Podaj pesel:");
                    String peselOne = buffer.readLine();
                    if(personByPesel.containsKey(peselOne)) {
                        Osoba szukanaOsoba = findPerson(peselOne);
                        System.out.println(szukanaOsoba);
                    }
                    break;
                case "2":
                    System.out.println("Wpisz pesel:");
                    String peselTwo = buffer.readLine();
                    System.out.println("Wpisz imie:");
                    String imie = buffer.readLine();
                    System.out.println("Wpisz nazwisko:");
                    String nazwisko = buffer.readLine();
                    registerPerson(peselTwo, imie, nazwisko);
                    System.out.println(findPerson(peselTwo));
                    break;
                case "3":
                    printAll();
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }

    public static Osoba findPerson(String pesel){
        Osoba szukanaOsoba = personByPesel.get(pesel);
        return szukanaOsoba;
    }

    public static void registerPerson(String pesel, String imie, String nazwisko){
        Osoba nowaOsoba = new Osoba(pesel);
        nowaOsoba.setImie(imie);
        nowaOsoba.setNazwisko(nazwisko);
        personByPesel.put(pesel, nowaOsoba);
    }

    public static void printAll(){
        System.out.println(personByPesel);
    }
}
