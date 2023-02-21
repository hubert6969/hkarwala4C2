public class zad19 {
    public static void main(String[] args) {
        int konsumenci = 12467;
        double jedenNapoj = 0.14;
        double cytrusowy =  0.64;

        double ileJedenNapoj = konsumenci*jedenNapoj;
        System.out.println("Liczba osób która kupuje napój energetyczny raz tygodniowo: "+ileJedenNapoj);

        double ileCytrusowy = konsumenci*cytrusowy;
        System.out.println("Liczba osób która preferuje smak cytrusowy: "+ileCytrusowy);
    }}
