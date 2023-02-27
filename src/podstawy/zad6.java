package podstawy;

public class zad6 {
    public static void main(String[] args) {
        int pomieszczenie1 = 3*4;
        int pomieszczenie2 = 3*4;
        int pomieszczenie3 = 2*3;
        int pomieszczenie4 = 2*2;

        int calkowita = pomieszczenie1 +pomieszczenie2+pomieszczenie3+pomieszczenie4;
        int jednaOsoba = calkowita/4;
        System.out.println("Powierzchnia na jedną osobę: " +jednaOsoba +"m²");

    }
}
