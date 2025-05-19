import java.util.*;

public class Konto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new HashMap<>();

        while (true) {
            System.out.println("1. Dodaj użytkownika");
            System.out.println("2. Zaloguj się");
            System.out.println("3. Wyjdź");
            System.out.print("Wybierz opcję: ");
            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1 -> dodajUzytkownika(users, scanner);
                case 2 -> logowanie(users, scanner);
                case 3 -> {
                    System.out.println("Zakończono program.");
                    return;
                }
                default -> System.out.println("Nieprawidłowa opcja.");
            }
        }
    }

    // Dodawanie nowego użytkownika
    public static void dodajUzytkownika(Map<String, String> users, Scanner scanner) {
        System.out.print("Podaj login: ");
        String login = scanner.nextLine();

        if (users.containsKey(login)) {
            System.out.println("Użytkownik o takim loginie już istnieje.");
            return;
        }

        String haslo;
        do {
            System.out.print("Podaj hasło: ");
            haslo = scanner.nextLine();
        } while (!weryfikujHaslo(haslo));

        users.put(login, haslo);
        System.out.println("Użytkownik dodany pomyślnie!");
    }

    public static void logowanie(Map<String, String> users, Scanner scanner) {
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Hasło: ");
        String haslo = scanner.nextLine();

        if (!users.containsKey(login)) {
            System.out.println("Błąd: użytkownik nie istnieje.");
        } else if (users.get(login).equals(haslo)) {
            System.out.println("Zalogowano pomyślnie!");
        } else {
            System.out.println("Błąd: niepoprawne hasło.");
        }
    }

    public static boolean weryfikujHaslo(String haslo) {
        if (haslo.length() < 4) {
            System.out.println("Hasło musi mieć co najmniej 4 znaki.");
            return false;
        }
        return true;
    }
}
