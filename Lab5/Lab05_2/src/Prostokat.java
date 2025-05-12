public class Prostokat extends Figura  {
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(float x, float y) {
        super.punkt.przesun(x ,y);
    }

    @Override
    public String opis() {
        return "Klasa Prostokąt. Powierzchnia: " + getPowierzchnia() + ". Kolor obiektu: " + kolor;
    }
}