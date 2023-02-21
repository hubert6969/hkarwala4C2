import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartość kupowanego produktu:");
        int wartosc = klawiatura.nextInt();

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        double stanowy = wartosc*podatekStanowy;
        double lokalny = wartosc*podatekLokalny;
        double wartoscCalkowita = wartosc+stanowy+lokalny;

        System.out.println("Wartość produktu:"+wartosc+" Podatek stanowy "+stanowy+" Podatek Lokalny "+lokalny+" Wartość całkowita "+wartoscCalkowita);
    }
}
