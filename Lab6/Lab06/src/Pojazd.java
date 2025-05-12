public abstract class Pojazd {
    protected String id;
    protected String model;
    protected boolean czyDostepny;

    public Pojazd(String id, String model, boolean czyDostepny){
        this.id = id;
        this.model = model;
        this.czyDostepny = czyDostepny;
    }

    public void wypozycz(){
        System.out.println("Wypożyczono samochód.");
        czyDostepny = false;
    };

    public void zwroc(){
        System.out.println("Zwrócono samochód.");
        czyDostepny = true;
    };

    public boolean isCzyDostepny(){
        return czyDostepny;
    };

    public String getId(){
        return id;
    };

    public String getModel(){
        return model;
    };

    abstract double obliczKoszt(int i);
}