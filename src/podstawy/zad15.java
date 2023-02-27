package podstawy;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę detaliczną:");
        int detaliczna = klawiatura.nextInt();
        double zysk = detaliczna*0.4;

        System.out.println("Zysk ze sprzedaży: "+zysk);
    }
}
