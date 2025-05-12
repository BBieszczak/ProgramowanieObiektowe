public class Engine {
    public int power;
    public String fuelType;

    public Engine(String fuelType, int power) {
        this.fuelType = fuelType;
        this.power = power;
    }

    public void startEngine(){
        System.out.println("Silnik uruchomiony");
    }

    public void displayInfo(){
        System.out.println("Silnik o mocy " + power + " KM, paliwo " + fuelType);
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return fuelType;
    }
}

