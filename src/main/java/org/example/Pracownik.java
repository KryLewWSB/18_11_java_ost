package org.example;

public class Pracownik implements DanePracownik{
    private String imie;
    private String nazwisko;
    private String dzial;
    private Integer wyplata;
    private Oddzial oddzial;

    public Pracownik(String imie, String nazwisko, String dzial, Integer wyplata, Oddzial odzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzial = dzial;
        this.wyplata = wyplata;
        this.oddzial = odzial;
    }
    @Override
    public void wyswietlDanePracownika(){
        System.out.println( "Imię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nDział: " + this.dzial +
                "\nWynagrodzenie: " + this.wyplata);
    }
}
