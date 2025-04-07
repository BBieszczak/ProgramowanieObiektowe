public class Student {
    String imie;
    String nazwisko;
    String kierunek;
    int nrIndeksu;
    int rokStudiów;

    public Student() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
        this.nrIndeksu = nrIndeksu;
        this.rokStudiów = rokStudiów;
    }

    public Student(String imie, String nazwisko, String kierunek, int nrIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
        this.nrIndeksu = nrIndeksu;
    }

    public Student(String imie, String nazwisko, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kierunek='" + kierunek + '\'' +
                ", nrIndeksu=" + nrIndeksu +
                ", rokStudiów=" + rokStudiów +
                '}';
    }
}
