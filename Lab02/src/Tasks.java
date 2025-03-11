import java.util.Scanner;
import java.util.Random;
public class Tasks {
    public static void Zad01(){
        int a, b,c=0;
        double mean, suma=0;
       System.out.println("Podaj liczbe studentow: \n");
       Scanner input = new Scanner(System.in);
       a = input.nextInt();
       if (a<0){
           System.out.println("Liczba nieprawidłowa");
       }else{
           while (c<a){
               System.out.println("Podaj ocene\n");
               b= input.nextInt();
               if (0 <= b && b<=10){
                   suma += b;
               }else {
                   System.out.println("Zła liczba\n");
                   c--;
               }
               c++;
           }
       }
        mean=suma/a;
       System.out.println("Srednia wynosi:"+mean);
    }
    public static void Zad02() {
        int sumaDodatnich = 0, sumaUjemnych = 0;
        int licznikDodatnich = 0, licznikUjemnych = 0;
        int liczba;

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczby do sumowania\n");

        for (int i = 0; i < 4; i++) {
            liczba = skaner.nextInt();
            if (liczba < 0) {
                sumaUjemnych = sumaUjemnych + liczba;
                licznikUjemnych = licznikUjemnych + 1;
            } else {
                sumaDodatnich = sumaDodatnich + liczba;
                licznikDodatnich = licznikDodatnich + 1;
            }
        }

        System.out.println("Suma liczb dodatnich: " + sumaDodatnich);
        System.out.println("Suma liczb ujemnych: " + sumaUjemnych);
        System.out.println("Liczba liczb dodatnich: " + licznikDodatnich);
        System.out.println("Liczba liczb ujemnych: " + licznikUjemnych);
    }

    public static void Zad03(){
        int liczbaPowtorzen;
        int wprowadzonaLiczba;
        int sumaParzystych = 0;

        System.out.println("Podaj liczbę powtórzeń: ");
        Scanner skaner = new Scanner(System.in);
        liczbaPowtorzen = skaner.nextInt();

        while (liczbaPowtorzen != 0) {
            System.out.println("Podaj liczbę: ");
            wprowadzonaLiczba = skaner.nextInt();

            if (wprowadzonaLiczba % 2 == 0) {
                sumaParzystych += wprowadzonaLiczba;
            }

            liczbaPowtorzen--;
        }

        System.out.println("Suma liczb parzystych wynosi: " + sumaParzystych);
    }
    public static void Zad04(){
        int liczba;
        int losowaLiczba;
        int minWartosc = -10;
        int maxWartosc = 45;

        int sumaParzystych = 0;
        System.out.println("Podaj liczbe n:\n");
        Scanner wejscie = new Scanner(System.in);
        Random generator = new Random();
        liczba = wejscie.nextInt();

        while (liczba != 0) {
            losowaLiczba = generator.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
            System.out.println(losowaLiczba);

            if (losowaLiczba % 2 == 0) {
                sumaParzystych = sumaParzystych + losowaLiczba;
            }
            liczba--;
        }

        System.out.println("Suma liczb parzystych wynosi: " + sumaParzystych);
    }
}
