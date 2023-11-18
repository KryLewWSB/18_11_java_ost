package org.example;

public class Main {
    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Tomasz", "Nowak", "IT", 6000, Oddzial.GDANSK);
        Pracownik pracownik2 = new Pracownik("Anna", "Kowalska", "IT", 7000, Oddzial.KRAKOW);
        pracownik.wyswietlDanePracownika();
        pracownik2.wyswietlDanePracownika();

    }
}