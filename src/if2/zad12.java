package if2;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Gdzie chcesz sprawdzic rozchodzenie sie dzwieku 'powietrze' 'woda' 'stal'? ");
        String gdzie = klawiatura.nextLine();
        System.out.println("Wprowadź odleglosc jaka fala dzwiekowa ma przebyc w metrach: ");
        int odleglosc = klawiatura.nextInt();

        double powietrzeCzas = odleglosc/343;
        double wodaCzas = odleglosc/1490;
        double stalCzas = odleglosc/5100;

        if (gdzie.equalsIgnoreCase("powietrze")){
            System.out.println("Czas potrzebny do pokonania przez dźwiek odleglosci w powietrzy wynosi:" +powietrzeCzas +" sekund");
        }
        else if (gdzie.equalsIgnoreCase("woda")){
            System.out.println("Czas potrzebny do pokonania przez dźwięk odległości w wodzie wynosi: "+wodaCzas+ " sekund");
        }
        else if (gdzie.equalsIgnoreCase("stal")) {
            System.out.println("Czas potrzebny do pokonania przez dźwięk odległości w stali wynosi: " + stalCzas + " sekund");
        }
    }
}
