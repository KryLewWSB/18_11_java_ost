package org.example;

public class Kierownik extends Pracownik {
    private Integer premiaKierownicza;
    public Kierownik(String imie, String nazwisko, String dzial, Integer wyplata, Oddzial odzial, Integer premiaKierownicza) {
        super(imie, nazwisko, dzial, wyplata, odzial);
        this.premiaKierownicza = premiaKierownicza;
    }
    @Override
    public void wyswietlDanePracownika(){
        System.out.println( "Imię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nDział: " + this.dzial +
                "\nWynagrodzenie: " + this.wyplata +
                "\nPremia Kierownicza: " + this.premiaKierownicza);
    }
}
