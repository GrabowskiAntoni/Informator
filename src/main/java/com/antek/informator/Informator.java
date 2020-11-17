package com.antek.informator;

import javax.management.relation.Relation;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Informator {
    public static HashMap<String, Osoba> personByPesel = new HashMap<>();
    public static void main(String... args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Witaj!\n");
        while(true){
            System.out.println("Wybierz opcję:\n\t1 - wyświetl osobę\n\t2 - rejestruj osobę\n\t3 - dodaj relację\n\t4 - wyświetl wszystkich\n\t5 - zakończ program");
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
                    System.out.println("Zarejestrowano osobę: " + findPerson(peselTwo));
                    break;
                case "3":
                    System.out.println("Wpisz pesel rodzica:\n");
                    String parentPesel = buffer.readLine();
                    System.out.println("Wpisz pesel dziecka:\n");
                    String childPesel = buffer.readLine();
                    System.out.println("Wpisz 1 jeśli mama, wpisz 2 jeśli tata:\n");
                    String relationString = buffer.readLine();
                    switch (relationString) {
                        case "1":
                            Parent parent1 = Parent.MOTHER;
                            addRelation(parentPesel, childPesel, parent1);
                            break;
                        case "2":
                            Parent parent2 = Parent.FATHER;
                            addRelation(parentPesel, childPesel, parent2);
                            break;
                    }
                case "4":
                    printAll();
                    break;
                case "5":
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

    public static void addRelation(String parentPesel, String childPesel, Parent parent) {
        // tu musisz storzyć relacje tzn.:
        //        if(parent.equals(Parent.MOTHER)) {
        //              ustawić atrybut mama w wyszukanym w mapie dziecku na obiekt mama wyszukanej po pesel oraz dodac do listy dzieci dziecko w wyszukanym po pesel rodzicu
        //        }
        //        else if(parent.equals(Parent.FATHER)) {
        //              ustawić atrybut tata w wyszukanym w mapie dziecku na obiekt tata wyszukanej po pesel oraz dodac do listy dzieci dziecko w wyszukanym po pesel rodzicu
        //        }
    }
}
