public class Main {
    public static void main(String[] args) {
        Punkt point1 = new Punkt(0, 1);
        Punkt point2 = new Punkt(2, 5);
        Punkt point3 = new Punkt(3, 3);

        System.out.println(point1.opis());
        point1.przesun(2, 4);
        System.out.println(point1.opis());

        System.out.println(point2.opis());
        point2.zeruj();
        System.out.println(point2.opis());

        System.out.println(point3.opis());
        point3.setX(10);
        System.out.println(point3.opis());

        Trojkat trojkat = new Trojkat(5, 10);
        Prostokat prostokat = new Prostokat(8,4);
        Figura figura = new Figura("Zielony");
        Okrag okrag = new Okrag(point2, 6);


        System.out.println(prostokat.getPowierzchnia());
        System.out.println(figura.opis());

        prostokat.przesun(3, 5);

        Kwadrat kwadrat = new Kwadrat(5);

        System.out.println(point3.opis());
        System.out.println(trojkat.opis());
        System.out.println(prostokat.opis());
        System.out.println(kwadrat.opis());
        System.out.println(okrag.opis());

        System.out.println(okrag.wSrodku(new Punkt(6,6)));
        System.out.println(okrag.wSrodku(new Punkt(4,4)));
    }
}