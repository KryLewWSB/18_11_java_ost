package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        Pracownik pracownik = new Pracownik("Tomasz", "Nowak", "IT", 6000, Oddzial.GDANSK);
        Pracownik pracownik2 = new Pracownik("Anna", "Kowalska", "IT", 7000, Oddzial.KRAKOW);
        Kierownik kierownik = new Kierownik("Anna",
                                            "Nowak",
                                            "Ksiegowosc",
                                            7000,
                                            Oddzial.GDYNIA,
                                            1500);
        pracownik.wyswietlDanePracownika();
        pracownik2.wyswietlDanePracownika();
        kierownik.wyswietlDanePracownika();*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Jaki obiekt chcesz stworzyć? (pracownik, kierownik)");
        String odpowiedz = scan.next();

        if(odpowiedz.equals( "pracownik" )) {
            System.out.println("Podaj imię pracownika: ");
            String imie = scan.next();
            System.out.println("Podaj nazwisko pracownika: ");
            String nazwisko = scan.next();
            System.out.println("Podaj dział pracownika: ");
            String dzial = scan.next();
            System.out.println("Podaj wynagrodzenie pracownika: ");
            int wynagrodzenie = scan.nextInt();
            System.out.println("Podaj oddział pracy pracownika: ");
            String oddzial = scan.next();
            Oddzial oddzialPoSprawdzeniu = Oddzial.KRAKOW;
            if (oddzial.equals(Oddzial.GDANSK.toString())) {
                oddzialPoSprawdzeniu = Oddzial.GDANSK;
            } else if (oddzial.equals(Oddzial.GDYNIA.toString())) {
                oddzialPoSprawdzeniu = Oddzial.GDYNIA;
            } else if (oddzial.equals(Oddzial.KRAKOW.toString())) {
                oddzialPoSprawdzeniu = Oddzial.KRAKOW;
            } else if (oddzial.equals(Oddzial.WARSZAWA.toString())) {
                oddzialPoSprawdzeniu = Oddzial.WARSZAWA;
            } else if (oddzial.equals(Oddzial.SOPOT.toString())) {
                oddzialPoSprawdzeniu = Oddzial.SOPOT;
            } else if (odpowiedz.equals("kierownik")) {
                System.out.println("Podaj imię kierownika: ");
                imie = scan.next();
                System.out.println("Podaj nazwisko kierownika: ");
                nazwisko = scan.next();
                System.out.println("Podaj dział kierownika: ");
                dzial = scan.next();
                System.out.println("Podaj wynagrodzenie kierownika: ");
                wynagrodzenie = scan.nextInt();
                System.out.println("Podaj oddział pracy kierownika: ");
                oddzial = scan.next();
                oddzialPoSprawdzeniu = Oddzial.KRAKOW;
                if (oddzial.equals(Oddzial.GDANSK.toString())) {
                    oddzialPoSprawdzeniu = Oddzial.GDANSK;
                } else if (oddzial.equals(Oddzial.GDYNIA.toString())) {
                    oddzialPoSprawdzeniu = Oddzial.GDYNIA;
                } else if (oddzial.equals(Oddzial.KRAKOW.toString())) {
                    oddzialPoSprawdzeniu = Oddzial.KRAKOW;
                } else if (oddzial.equals(Oddzial.WARSZAWA.toString())) {
                    oddzialPoSprawdzeniu = Oddzial.WARSZAWA;
                } else if (oddzial.equals(Oddzial.SOPOT.toString())) {
                    oddzialPoSprawdzeniu = Oddzial.SOPOT;
                }
                System.out.println("Podaj premię kierownika: ");
                int premia = scan.nextInt();

                Kierownik kierownik1 = new Kierownik(imie, nazwisko, dzial, wynagrodzenie, oddzialPoSprawdzeniu, premia);

                kierownik1.wyswietlDanePracownika();
            }

        }
    }
}