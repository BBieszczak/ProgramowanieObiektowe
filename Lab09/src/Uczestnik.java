import java.util.Objects;

public class Uczestnik {
    int ID;
    String imie;
    int wiek;

    public Uczestnik(int ID, String imie, int wiek) {
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getID() {
        return ID;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Zad03{" +
                "ID=" + ID +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID, imie, wiek);
    }
}
