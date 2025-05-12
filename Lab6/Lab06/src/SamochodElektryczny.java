public class SamochodElektryczny extends Pojazd implements Elektryczny{

    private int poziomBaterii;

    public SamochodElektryczny(String id, String model, boolean czyDostepny, int poziomBaterii) {
        super(id, model, czyDostepny);
        this.poziomBaterii = poziomBaterii;
    }

    @Override
    public double obliczKoszt(int i) {
        return 1.75 * i;
    }


    @Override
    public void naladuj() {
        poziomBaterii = 100;
    }

    @Override
    public int poziomNaladowania() {
        return poziomBaterii;
    }
}