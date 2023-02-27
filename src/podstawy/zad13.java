package podstawy;

import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę zjedzonych ciastek:");
        int zjedzoneCiastka = klawiatura.nextInt();

        int porcjaKcal = 300;
        int porcja = 4;
        int kcalCiastka = porcjaKcal/porcja;
        int kcal = zjedzoneCiastka * kcalCiastka;

        System.out.println("Zjadłeć tyle kalorii: "+kcal);
    }
}
