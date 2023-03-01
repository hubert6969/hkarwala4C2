package if2;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź ilość kalori: ");
        int kalorie = klawiatura.nextInt();

        System.out.println("Wprowadź ilość gramów: ");
        int gramy = klawiatura.nextInt();

        System.out.println("Wprowadź ilość tłuszczu: ");
        int tluszcz = klawiatura.nextInt();

        double kalorieZTluszczu = tluszcz*9;
        double procentKaloriZTluszczu = kalorieZTluszczu/kalorie;
        double kalorie30 = kalorie*0.3;

        if (kalorieZTluszczu<kalorie30){
            System.out.println("Produkt jest niskotłuszczowy!");
        }
    }
}
