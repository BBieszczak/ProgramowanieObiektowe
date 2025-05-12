public class Adres {
    public String ulica;
    public int numberDomu;
    public String kodPocztowy;
    public String miasto;

    public Adres(String ulica, int numberDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        if (ulica == null) throw new NieprawidlowyAdresException("Ulica nie może być null'!");
        if (miasto == null) throw new NieprawidlowyAdresException("Miasto nie możę być null'em!");
        if (numberDomu <= 0) throw new NieprawidlowyAdresException("Numer domu nie może być mniejszy bądź równy 0!");
        if (kodPocztowy == null) throw new NieprawidlowyAdresException("Kod pocztowy nie może być null'em!");

        this.ulica = ulica;
        this.numberDomu = numberDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }
}