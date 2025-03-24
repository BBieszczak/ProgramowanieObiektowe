package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {

    InputData input = new InputData();

    public void Task1() {
        System.out.println("Podaj początek przedziału: ");
        int a = input.InputInt();
        System.out.println("Podaj koniec przedziału: ");
        int b = input.InputInt();
        System.out.println("Podaj ilość elementów tablicy: ");
        int ilosc = input.InputInt();

        int[] arr = RandomValue.RandValueArr(a, b, ilosc);
        if (arr == null) {
            System.out.println("Błąd generowania tablicy.");
            return;
        }

        float suma = 0;
        System.out.println("Elementy tablicy: ");
        for (int item : arr) {
            System.out.print(item + " ");
            suma += item;
        }
        System.out.println("\nSuma elementów tablicy: " + suma);
        System.out.println("Średnia elementów tablicy: " + (suma / arr.length));
    }

    public void Task2() {
        int[] tablica1 = {1, 2, 3, 4, 5, 6};
        int[] tablica2 = {10, 20, 30, 40, 50};

        System.out.println("Co drugi element tablica1:");
        for (int i = 0; i < tablica1.length; i += 2) {
            System.out.print(tablica1[i] + " ");
        }
        System.out.println("\nCo drugi element tablica2:");
        for (int i = 0; i < tablica2.length; i += 2) {
            System.out.print(tablica2[i] + " ");
        }
        System.out.println();
    }

    public void Task3() {
        String[] slowa = {"ala", "ma", "kota", "i", "psa"};
        System.out.println("Słowa zamienione na wielkie litery:");
        for (String slowo : slowa) {
            System.out.println(slowo.toUpperCase());
        }
    }

    public void Task4() {
        Scanner scanner = new Scanner(System.in);
        String[] slowa = new String[5];

        System.out.println("Podaj 5 słów:");
        for (int i = 0; i < 5; i++) {
            slowa[i] = scanner.next();
        }

        System.out.println("Odwrócone słowa:");
        for (int i = slowa.length - 1; i >= 0; i--) {
            System.out.println(new StringBuilder(slowa[i]).reverse());
        }
    }

    public void Task5() {
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[8];

        System.out.println("Podaj 8 liczb:");
        for (int i = 0; i < 8; i++) {
            liczby[i] = scanner.nextInt();
        }

        Arrays.sort(liczby);
        System.out.println("Posortowane liczby: " + Arrays.toString(liczby));
    }

    public void Task6() {
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[5];

        System.out.println("Podaj 5 liczb:");
        for (int i = 0; i < 5; i++) {
            liczby[i] = scanner.nextInt();
        }

        System.out.println("Silnie liczb:");
        for (int liczba : liczby) {
            System.out.println(liczba + "! = " + silnia(liczba));
        }
    }

    private long silnia(int n) {
        if (n <= 1) return 1;
        return n * silnia(n - 1);
    }

    public void Task7() {
        String[] tablica1 = {"Ala", "ma", "kota"};
        String[] tablica2 = {"Ala", "ma", "kota"};

        boolean saTakieSame = Arrays.equals(tablica1, tablica2);
        System.out.println("Czy tablice są takie same? " + (saTakieSame ? "Tak" : "Nie"));
    }
}
