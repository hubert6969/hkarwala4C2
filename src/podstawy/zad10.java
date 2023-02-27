package podstawy;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String pierwszeimie, drugieimie, nazwisko;
        System.out.println("Podaj swoje pierwsze imie");
        pierwszeimie = klawiatura.nextLine();
        System.out.println("Podaj swoje drugie imie");
        drugieimie = klawiatura.nextLine();
        System.out.println("Podaj swoje nazwisko");
        nazwisko = klawiatura.nextLine();
        char firstInitial = pierwszeimie.charAt(0);
        char middleInitial = drugieimie.charAt(0);
        char lastInitial = nazwisko.charAt(0);
        System.out.print("Twoje inicjaly to:" + pierwszeimie + drugieimie + nazwisko);
    }
}
