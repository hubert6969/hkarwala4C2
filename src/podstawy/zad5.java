package podstawy;

public class zad5 {
    public static void main(String[] args) {
        int pomieszczenie1 = 3*4;
        int pomieszczenie2 = 3*4;
        int pomieszczenie3 = 2*3;
        int pomieszczenie4 = 2*2;

        System.out.println("Powierzchnia pierwszego pomieszczenia:" + pomieszczenie1 + "m²");
        System.out.println("Powierzchnia drugiego pomieszczenia:" + pomieszczenie2 + "m²");
        System.out.println("Powierzchnia trzeciego pomieszczenia:" + pomieszczenie3 + "m²");
        System.out.println("Powierzchnia czwartego pomieszczenia:" + pomieszczenie3 + "m²");

        int calkowita = pomieszczenie1 +pomieszczenie2+pomieszczenie3+pomieszczenie4;
        System.out.println("Powierzchnia całkowita mieszkania:"+ calkowita + "m²");


    }
}
