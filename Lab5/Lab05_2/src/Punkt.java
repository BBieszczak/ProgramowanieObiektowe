public class Punkt {
    float x, y;

    public Punkt() {
        x = 0;
        y = 0;
    }

    public Punkt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void zeruj() {
        x = 0;
        y = 0;
    }

    public String opis() {
        return "Klasa Punkt. X = " + x + ". Y = " + y;
    }

    public void przesun(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}