package org.example;

public class Pracownik implements DanePracownik{
    protected String imie;
    protected String nazwisko;
    protected String dzial;
    protected Integer wyplata;
    protected Oddzial oddzial;

    public Pracownik(String imie, String nazwisko, String dzial, Integer wyplata, Oddzial odzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzial = dzial;
        this.wyplata = wyplata;
        this.oddzial = odzial;
    }
    @Override
    public void wyswietlDanePracownika(){
        System.out.println("________________________");
        System.out.println( "Imię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nDział: " + this.dzial +
                "\nWynagrodzenie: " + this.wyplata);
        System.out.println("________________________");
    }
}
