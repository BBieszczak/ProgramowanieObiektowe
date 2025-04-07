import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrZad;
        System.out.println("Podaj które zadanie chcesz uruchomić podając numer zadania ");
        nrZad = scanner.nextInt();
        System.out.println("Wybrałeś zadanie numer " + nrZad);

        switch (nrZad) {
            case 1:
                Osoba osoba1 = new Osoba();
                Osoba osoba2 = new Osoba("Bartosz", 21);
                Osoba osoba3 = new Osoba("Bartosz", "Bieszczak", 20);

                System.out.println(osoba1.toString());
                System.out.println(osoba2.toString());
                System.out.println(osoba3.toString());
                break;

            case 2:
                Student student1 = new Student("Bartosz","Bieszczak");
                Student student2 = new Student("Bartosz","Bieszczak","IiE");
                Student student3 = new Student("Bartosz","Bieszczak","IiE",135025);
                Student student4 = new Student();

                System.out.println(student1.toString());
                System.out.println(student2.toString());
                System.out.println(student3.toString());
                System.out.println(student4.toString());
                break;

            case 3:
                Zad3.wprowadzanieDanych();
                    break;

            default:
                System.out.println("Podałeś nie istniejący numer zdania");
        }
    }
}