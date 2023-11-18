package org.example;

public class Kierownik extends Pracownik {
    private Integer premiaKierownicza;
    public Kierownik(String imie, String nazwisko, String dzial, Integer wyplata, Oddzial odzial) {
        super(imie, nazwisko, dzial, wyplata, odzial);
    }
}
