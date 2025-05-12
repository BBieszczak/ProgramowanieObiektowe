public class Okrag extends Figura {
    public double promien;

    public Okrag() {
        super(new Punkt());
        promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        super(srodek);
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica() {
        return 2 * promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return this.promien;
    }

    public boolean wSrodku(Punkt punkt) {
        return Math.pow((super.punkt.x - punkt.getX()), 2) + Math.pow((super.punkt.y - punkt.getY()), 2) <= Math.pow(promien, 2);
    }

    public String opis() {
        return "Klasa Okrąg. Promień: " + getPromien();
    }
}