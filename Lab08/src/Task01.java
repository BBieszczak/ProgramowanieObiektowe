import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int a = scanner.nextInt();

            if (a < 0) throw new IllegalArgumentException("Liczba nie może być ujemna!");
            System.out.println("Pierwiastek z " + a + " = " + Math.sqrt(a));
        }

        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        catch (InputMismatchException e){
            System.out.println("Podana wartość nie jest liczbą!");
        }

    }
}