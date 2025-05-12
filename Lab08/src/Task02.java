public class Task02 {
    public static int silnia(int n) throws BlednaWartoscDlaSilniException {
        BlednaWartoscDlaSilniException Checked = new BlednaWartoscDlaSilniException("Wartość nie może być ujemna.");
        int wynik = 1;
        if (n < 0) throw Checked;
        for(int i = n; i > 0; i--) wynik *= i;
        return wynik;
    }
}