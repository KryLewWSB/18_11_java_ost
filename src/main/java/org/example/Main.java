package org.example;

import java.util.ArrayList;
import java.util.List;
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

        List<Pracownik> listaPracownicy = new ArrayList<>();
        List<Kierownik> listaKierownicy = new ArrayList<>();
        while (true) {
            System.out.println("Jaki obiekt chcesz stworzyć? (pracownik, kierownik)/ jeśli zakończyć wpisz x! ");
            String odpowiedz = scan.next();

            if (odpowiedz.equals("pracownik")) {
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
                }
                listaPracownicy.add(new Pracownik(imie, nazwisko, dzial, wynagrodzenie, oddzialPoSprawdzeniu));

            } else if (odpowiedz.equals("kierownik")) {
                System.out.println("Podaj imię kierownika: ");
                String imie = scan.next();
                System.out.println("Podaj nazwisko kierownika: ");
                String nazwisko = scan.next();
                System.out.println("Podaj dział kierownika: ");
                String dzial = scan.next();
                System.out.println("Podaj wynagrodzenie kierownika: ");
                int wynagrodzenie = scan.nextInt();
                System.out.println("Podaj oddział pracy kierownika: ");
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
                }
                System.out.println("Podaj premię kierownika: ");
                int premia = scan.nextInt();

                listaKierownicy.add(new Kierownik(imie, nazwisko, dzial, wynagrodzenie, oddzialPoSprawdzeniu, premia));

            } else {
                break;
            }
        }



        for (Pracownik pracownik : listaPracownicy) {
            pracownik.wyswietlDanePracownika();
        }
        for (Kierownik kierownik : listaKierownicy) {
            kierownik.wyswietlDanePracownika();
        }

    }
}