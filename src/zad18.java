public class zad18 {
    public static void main(String[] args) {

        int akcje = 600;
        double cenaJednejAkcji = 21.77;
        double prowizja = 0.02;

        double cenaAkcji = akcje*cenaJednejAkcji;
        System.out.println("Cena za wszystkie akcje: "+cenaAkcji +" zł");

        double cenaProwizji = akcje*prowizja;
        System.out.println("Wysokość prowizji: "+cenaProwizji+" zł");

        double lacznaKwota = cenaAkcji+cenaProwizji;
        System.out.println("Łączna zapłacona kwota: "+ lacznaKwota+" zł");

    }
}
