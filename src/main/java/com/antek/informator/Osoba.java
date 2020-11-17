package com.antek.informator;

import java.util.ArrayList;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private ArrayList<Osoba> dzieci;
    private Osoba mama;
    private Osoba tata;

    public Osoba(String pesel) {
        this.pesel = pesel;
    }


    @Override
    public String toString() {
        return " imie:" + imie + ", nazwisko:" + nazwisko + printChildren() + "\r\n]";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {

        this.imie = imie;
    }

    public String getNazwisko() {

        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {

        this.nazwisko = nazwisko;
    }

    public String getPesel() {

        return pesel;
    }

    public ArrayList<Osoba> getDzieci() {
        if(dzieci == null) {
            this.dzieci = new ArrayList<>();
        }
        return dzieci;
    }

    public void setDzieci(ArrayList<Osoba> dzieci) {
        this.dzieci = dzieci;
    }

    public Osoba getMama() {
        return this.mama;
    }

    public void setMama(Osoba mama) {
        this.mama = mama;
    }

    public Osoba getTata() {
        return this.tata;
    }

    public void setTata(Osoba tata) {
        this.tata = tata;
    }

    private String  printChildren() {
        String children = "";
        if (dzieci != null && !dzieci.isEmpty()) {
            for (Osoba dziecko : dzieci) {
                children += "\n\t" + dziecko.toString();
            }
        }
        return children;
    }
}

