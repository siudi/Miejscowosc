package pl.gornik;

import pl.gornik.miejscowosc.Miejscowosc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Miejscowosc> miejscowoscList = new ArrayList<>();

        Miejscowosc miejscowosc = new Miejscowosc("Krzcin","Koprzywnica",489,426,20);

        System.out.printf("Średnie zaludnienie na 1ha wynosi: %.2f ", miejscowosc.srednieZaludnienie());
        System.out.println();
        System.out.printf("Powierzchnia użytkowa w ha wynosi: %.2f ", miejscowosc.powierzchniaUzytkowa());


        Miejscowosc miejsc;
        String nazwa;
        String gmina;
        int liczbaLudnosci;
        double powierzchnia;
        double nieuzytki;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for(int i = 0; i < 2; i++){
            System.out.println("Podaj nazwę miejscowości: ");
            nazwa = scanner.nextLine();
            System.out.println("Podaj gminę: ");
            gmina = scanner.nextLine();
            System.out.println("Podaj liczbę ludności: ");
            liczbaLudnosci = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Podaj powierzchnię: ");
            powierzchnia = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj nieużytki");
            nieuzytki = scanner.nextDouble();
            scanner.nextLine();

            miejsc = new Miejscowosc(nazwa, gmina, liczbaLudnosci, powierzchnia, nieuzytki);
            miejscowoscList.add(miejsc);
        }
        System.out.println(miejscowoscList);
    }

}