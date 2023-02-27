package podstawy;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoje ulubione miasto:");
        String miasto = klawiatura.nextLine();

        char actualValue = miasto.charAt(0);

        System.out.println("Długość znaków: "+miasto.length());
        System.out.println("Z duzej litery "+miasto.toUpperCase());
        System.out.println("Długość znaków: "+miasto.toLowerCase());
        System.out.println("Długość znaków: "+actualValue);


    }
}
