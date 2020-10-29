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
        String toCoWypisze = "Nazywam się ";
        toCoWypisze = toCoWypisze + imie + ' ' + nazwisko;
        if (dzieci != null) {
            toCoWypisze += ", a moje dzieci to: ";
            for (Osoba dziecko : dzieci) {
                toCoWypisze += dziecko;
            }
        }
        return toCoWypisze;
    }

    public String shortString() {
        return imie + " " + nazwisko;
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
}

