public class Main {

    public enum Swiatlo{
        CZERWONE("Stoj"), ZIELONE("Jedz"), ZOLTNE("Uwaga");

        private final String komunikat;

        Swiatlo(String komunikat) {
            this.komunikat = komunikat;
        }

        public String getKomunikat(){
            return komunikat;
        }
    }
    public static void main(String[] args) {
    Swiatlo swiatlo = Swiatlo.CZERWONE;
        System.out.println(swiatlo);
    }
}