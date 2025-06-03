import java.util.*;

public class Zadania {
    public static void zadanie01(){
        List<String> lista = new ArrayList<>();
        String imie = "";
        while (!imie.equalsIgnoreCase("-")){
            Scanner scan = new Scanner(System.in);
            imie = scan.next();
            lista.add(imie);
        }
        for (String item: lista) {
            System.out.println(item);
        }
    }

    public static void zadanie02() {
        Scanner scan = new Scanner(System.in);
        Map<String, String> pary = new HashMap<>();
        String imie1 = "";
        String imie2 = "";

        while (true) {
            System.out.println("Podaj imię:");
            imie1 = scan.next();
            if (imie1.equals("-")) {
                break;
            }
            System.out.println("Podaj imię partnera:");
            imie2 = scan.next();
            pary.put(imie1, imie2);
        }

        System.out.println("Podaj imię osoby, której partnera chcesz znaleźć:");
        String imieSzukane = scan.next();

        if (pary.containsKey(imieSzukane)) {
            System.out.println("Partner " + imieSzukane + " to: " + pary.get(imieSzukane));
        } else {
            System.out.println("Nie znaleziono takiej osoby");
        }
    }
    public static void zadanie03() {
            List<Uczestnik> uczestnicyArray = new ArrayList<>();
            uczestnicyArray.add(new Uczestnik(143, "Anna", 22));
            uczestnicyArray.add(new Uczestnik(542, "Bartek", 16));
            uczestnicyArray.add(new Uczestnik(376, "Celina", 18));

            for (Uczestnik u : uczestnicyArray) {
                System.out.println(u);
            }
    }


}
