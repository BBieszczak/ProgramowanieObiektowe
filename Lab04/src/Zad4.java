import java.util.Scanner;

public class Zad4 {


        static class BazaStudentow {
            public Student[] studenci = new Student[100];

            public BazaStudentow() {
                for (int i = 0; i < studenci.length; i++) {
                    studenci[i] = new Student();
                }
            }


            public void ustawStudenta(int index,String imie, String nazwisko, String kierunek, int nrIndeksu) {
                if (index >= 0 && index < studenci.length) {
                    studenci[index]= new Student(imie,nazwisko,kierunek,nrIndeksu);
                } else {
                    System.out.println("Nieprawidłowy indeks.");
                }
            }

            public void usunStudenta(int index) {
                if (index >= 0 && index < studenci.length) {
                    studenci[index] = new Student();
                } else {
                    System.out.println("Nieprawidłowy indeks.");
                }
            }

            public void pokazStudenta(int index) {
                if (index >= 0 && index < studenci.length) {
                    System.out.println(studenci[index]);
                } else {
                    System.out.println("Nieprawidłowy indeks.");
                }
            }

            public void pokazWszystkichStudentow() {
                for (int i = 0; i < studenci.length; i++) {
                    System.out.println("[" + i + "]: " + studenci[i]);
                }
            }

            public void pokazZakresStudentow(int od, int do_) {
                if (od >= 0 && do_ < studenci.length && od <= do_) {
                    for (int i = od; i <= do_; i++) {
                        System.out.println("[" + i + "]: " + studenci[i]);
                    }
                } else {
                    System.out.println("Nieprawidłowy zakres.");
                }
            }
        }



    }

