import java.util.Scanner;
import tasks.Tasks;

public class RunTasks {

    Scanner input = new Scanner(System.in);
    Tasks tasks = new Tasks();

    public void Run() {
        while (true) {
            System.out.println("\nWybierz zadanie do wykonania:");
            System.out.println("1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("8. Wyjście");

            System.out.print("Twój wybór: ");
            int wybor = input.nextInt();

            if (wybor == 8) {
                System.out.println("Zakończenie programu.");
                return;
            }

            switch (wybor) {
                case 1 -> tasks.Task1();
                case 2 -> tasks.Task2();
                case 3 -> tasks.Task3();
                case 4 -> tasks.Task4();
                case 5 -> tasks.Task5();
                case 6 -> tasks.Task6();
                case 7 -> tasks.Task7();
                default -> System.out.println("Nieprawidłowy wybór.");
            }
        }
    }
}


