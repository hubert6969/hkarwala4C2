import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wynik z pierwszego testu:");
        int test1 = klawiatura.nextInt();
        System.out.println("Podaj wynik z drugiego testu:");
        int test2 = klawiatura.nextInt();
        System.out.println("Podaj wynik z trzeciego testu:");
        int test3 = klawiatura.nextInt();

        double suma = test1+test2+test3;
        double srednia = suma/3;

        System.out.println("Wynik z pierwszego testu: "+test1+" Wynik z drugiego testu: "+test2+" Wynik z trzeciego"+test3+" Średnia z wszystkich: "+srednia);
    }
}
