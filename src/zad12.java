import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę przejechanych kilometrów:");
        int przejechaneKilometry = klawiatura.nextInt();

        System.out.println("Podaj litry zużytego paliwa:");
        int litryPaliwa = klawiatura.nextInt();

        int kilometryNaLitrze = przejechaneKilometry/litryPaliwa;

        System.out.println("Liczba przejechanych kilometrów na litrze:" + kilometryNaLitrze);

    }
}
