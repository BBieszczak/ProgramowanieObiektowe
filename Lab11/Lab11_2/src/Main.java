public class Main {

    public enum PizzaSize{
        MALA(25,20), SREDNIA(35,30), DUZA(45,35);

        private final int cena;
        private final int rozmiar;

        PizzaSize(int cena, int rozmiar) {
            this.cena = cena;
            this.rozmiar = rozmiar;
        }

        public int getCena() {
            return cena;
        }

        public int getRozmiar() {
            return rozmiar;
        }
    }
    public static void main(String[] args) {
    PizzaSize.DUZA.getCena();
    PizzaSize.DUZA.getRozmiar();
    }
}