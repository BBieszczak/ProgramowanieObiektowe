public class Kwadrat extends Prostokat {

    public Kwadrat(double dlugosc) {
        super(dlugosc, dlugosc);
    }

    public double getDlugosc() {
        return super.wys;
    }

    public void setDlugosc(double dlugosc) {
        super.wys = dlugosc;
        super.szer = dlugosc;
    }

    @Override
    public String opis() {
        return "Klasa Kwadrat. Powierzchnia: " + getPowierzchnia() + ". Kolor obiektu: " + kolor;
    }
}
