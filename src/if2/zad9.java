package if2;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź wage przesyłki: ");
        int waga = klawiatura.nextInt();

        System.out.println("Wprowadź odległość przesyłki: ");
        int odleglosc = klawiatura.nextInt();

        if (waga<=1){
            System.out.println("Koszt przesyłki wynosi 1,10 zł");
        }
        else if (waga<=3){
            System.out.println("Koszt przesyłki wynosi 2,2 zł");
        }
        else if (waga<=5){
            System.out.println("Koszt przesyłki wynosi 3,70 zł");
        }
        else if (waga>5){
            System.out.println("Koszt przesyłki wynosi 3,80 zł");
        }
    }
}
