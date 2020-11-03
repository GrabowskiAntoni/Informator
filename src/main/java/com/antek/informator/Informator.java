package com.antek.informator;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Informator {
    public static HashMap<String, Osoba> personByPesel = new HashMap<>();
    public static void main(String... args) throws IOException {
        System.out.println("Witaj\nWybierz opcje:\n1 - Wyświetl osoby\n2 - Rejestruj osobe\nAby zakonczyc program wpisz exit");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line = buffer.readLine();
            switch(line){
                case "1":
                    //printPerson(""); // metoda przyjmujaca string pesel wyswietla osobe po peselu
                    break;
                case "2":
                    //registerPerson(); // metoda rejestruj osobe
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }

    private static String printPerson(String pesel){
        return "pesel";
    }
    private static void registerPerson(Osoba rejestrowana){

    }
}
