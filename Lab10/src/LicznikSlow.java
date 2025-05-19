import java.util.*;

public class LicznikSlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst:");
        String tekst = scanner.nextLine();

        tekst = tekst.toLowerCase();
        tekst = tekst.replaceAll("[.,!?;:]", "");

        String[] slowa = tekst.split(" ");

        Map<String, Integer> mapaSlow = new HashMap<>();

        for (String slowo : slowa) {
            if (mapaSlow.containsKey(slowo)) {
                int obecnaLiczba = mapaSlow.get(slowo);
                mapaSlow.put(slowo, obecnaLiczba + 1);
            } else {
                mapaSlow.put(slowo, 1);
            }
        }

        System.out.println("Wystąpienia słów:");
        for (String slowo : mapaSlow.keySet()) {
            int liczba = mapaSlow.get(slowo);
            System.out.println(slowo + ": " + liczba);
        }
    }
}


