package podstawy;

import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj długość pokoju nr1:");
        int dlugosc1 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pokoju nr1:");
        int szerokosc1 = klawiatura.nextInt();

        System.out.println("Podaj długość pokoju nr2:");
        int dlugosc2 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pokoju nr2:");
        int szerokosc2 = klawiatura.nextInt();

        System.out.println("Podaj długość pokoju nr3:");
        int dlugosc3 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pokoju nr3:");
        int szerokosc3 = klawiatura.nextInt();

        System.out.println("Podaj długość pokoju nr4:");
        int dlugosc4 = klawiatura.nextInt();
        System.out.println("Podaj szerokosc pokoju nr4:");
        int szerokosc4 = klawiatura.nextInt();

        int pomieszczenie1 = szerokosc1*dlugosc1;
        int pomieszczenie2 = szerokosc2*dlugosc2;
        int pomieszczenie3 = szerokosc3*dlugosc3;
        int pomieszczenie4 = szerokosc4*dlugosc4;

        int powierzchniaCalkowita = pomieszczenie1+pomieszczenie2+pomieszczenie3+pomieszczenie4;
        System.out.println("Powierzchnia pierwszego pomieszczenia " +pomieszczenie1 +"m²");
        System.out.println("Powierzchnia drugiego pomieszczenia " +pomieszczenie2 +"m²");
        System.out.println("Powierzchnia trzeciego pomieszczenia " +pomieszczenie3 +"m²");
        System.out.println("Powierzchnia czwartego pomieszczenia " +pomieszczenie4 +"m²");

        int jednaOsoba = powierzchniaCalkowita/4;
        System.out.println("Powierzchnia na jedną osobę: " +jednaOsoba +"m²");

    }
}
