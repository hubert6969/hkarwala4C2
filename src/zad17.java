import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę posiłku:");
        int cenaPosilku = klawiatura.nextInt();
        double podatek = 0.0675;
        double podatekOdPosilku = cenaPosilku*podatek;
        double napiwek = (cenaPosilku+podatekOdPosilku)*0.20;
        double lacznaKwota = cenaPosilku+podatekOdPosilku+napiwek;

        System.out.println("Cena posiłku: "+cenaPosilku + " zł");
        System.out.println("Wartość podatku: "+podatekOdPosilku+ " zł");
        System.out.println("Wartość napiwku: "+napiwek+ " zł");
        System.out.println("Łączna kwota do zapłaty: "+lacznaKwota+" zł");
    }
        }
