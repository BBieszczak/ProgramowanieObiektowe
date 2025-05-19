import java.util.*;

public class KartaDań {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> menu = new LinkedHashMap<>();

        while (true) {
            System.out.println("1. Dodaj nowe danie");
            System.out.println("2. Wyświetl kartę dań");
            System.out.println("3. Usuń danie");
            System.out.println("4. Oblicz rachunek");
            System.out.println("5. Zakończ");
            int opcja = scanner.nextInt();
            scanner.nextLine();

            switch (opcja) {
                case 1 -> dodajDanie(menu, scanner);
                case 2 -> wyswietlKarte(menu);
                case 3 -> usunDanie(menu, scanner);
                case 4 -> obliczRachunek(menu, scanner);
                case 5 -> {
                    return;
                }
                default -> System.out.println("Nieprawidłowa opcja.");
            }
        }
    }

    public static void dodajDanie(Map<String, Double> menu, Scanner scanner) {
        System.out.print("Podaj nazwę dania: ");
        String nazwa = scanner.nextLine();
        System.out.print("Podaj cenę dania: ");
        double cena = scanner.nextDouble();
        scanner.nextLine();

        menu.put(nazwa, cena);
        System.out.printf("Dodano: %s – %.2f zł%n", nazwa, cena);
    }

    public static void wyswietlKarte(Map<String, Double> menu) {
        if (menu.isEmpty()) {
            System.out.println("Karta dań jest pusta.");
            return;
        }

        System.out.println("\n KARTA DAŃ");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.printf("%s – %.2f zł%n", entry.getKey(), entry.getValue());
        }
    }

    public static void usunDanie(Map<String, Double> menu, Scanner scanner) {
        System.out.print("Podaj nazwę dania do usunięcia: ");
        String nazwa = scanner.nextLine();

        if (menu.remove(nazwa) != null) {
            System.out.println("Danie usunięto.");
        } else {
            System.out.println("Nie znaleziono takiego dania.");
        }
    }

    public static void obliczRachunek(Map<String, Double> menu, Scanner scanner) {
        System.out.println("Podaj nazwy dań oddzielone przecinkami:");
        String[] dania = scanner.nextLine().split(",");

        double suma = 0.0;
        List<String> zamowione = new ArrayList<>();

        for (String danie : dania) {
            String nazwa = danie.trim();
            if (menu.containsKey(nazwa)) {
                suma += menu.get(nazwa);
                zamowione.add(nazwa);
            } else {
                System.out.printf("Danie \"%s\" nie istnieje w karcie.%n", nazwa);
            }
        }

        System.out.printf("Rachunek za" + zamowione + " suma" + suma + "zł");
    }
}
