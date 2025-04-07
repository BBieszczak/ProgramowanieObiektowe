import java.util.Scanner;

public class Zad3 {
    public static void wprowadzanieDanych(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie= scanner.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko= scanner.next();
        System.out.println("Podaj kierunek: ");
        String kierunek=scanner.next();
        System.out.println("Podaj nrumer indeksu: ");
        int nrIndeksu=scanner.nextInt();
        System.out.println("Podaj rok studiów: ");
        int rokStudiów=scanner.nextInt();

        Student student = new Student();
        System.out.println(student);

    }
}
