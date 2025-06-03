import java.util.Scanner;

public class WywołanieZadań {

    public static void wywołanie() {
        System.out.println("Wybierz które zadanie chcesz zobaczyć (1-5)");
        Scanner scan = new Scanner(System.in);
        int zadanie = scan.nextInt();

        switch (zadanie) {
            case 1 -> Zadania.zadanie01();
            case 2 -> Zadania.zadanie02();
            case 3 -> Zadania.zadanie03();
        }
    }
}
