public class Samochod extends Pojazd{

    public Samochod(String id, String model, boolean czyDostepny) {
        super(id, model, czyDostepny);
    }

    @Override
    public double obliczKoszt(int i) {
        return 1.45 * i;
    }
}