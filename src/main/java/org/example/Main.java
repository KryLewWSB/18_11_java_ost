package org.example;

public class Main {
    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Tomasz", "Nowak", "IT", 6000);
        Pracownik pracownik2 = new Pracownik("Anna", "Kowalska", "IT", 7000);
        System.out.println( "Imię: " + pracownik.imie +
                            "\nNazwisko: " + pracownik.nazwisko +
                            "\nDział: " + pracownik.dzial +
                            "\nWynagrodzenie: " + pracownik.wyplata);

        System.out.println( "Imię: " + pracownik2.imie +
                "\nNazwisko: " + pracownik2.nazwisko +
                "\nDział: " + pracownik2.dzial +
                "\nWynagrodzenie: " + pracownik2.wyplata);
    }
}