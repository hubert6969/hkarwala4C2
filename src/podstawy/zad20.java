package podstawy;

import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę ciastek jaką chcesz upiec:");
        int liczbaCiastek = klawiatura.nextInt();

        double wszystkieCiastka = 48;
        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;

        double jednoCiastkoCukier = cukier/48;
        double jednoCiastkoMaslo = maslo/48;
        double jednoCiastkoMaka = maka/48;

        double ileCukru = jednoCiastkoCukier*liczbaCiastek;
        double ileMasla = jednoCiastkoMaslo*liczbaCiastek;
        double ileMaki = jednoCiastkoMaka*liczbaCiastek;

        System.out.println("Tyle szklanek potrzebujesz do zrobienia tylu ciastek: "+ileCukru+"szklanki cukru"+ileMasla+" szklanki masła" + ileMaki+" szklanki mąki");
    }
}
