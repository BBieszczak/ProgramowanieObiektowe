
public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double maxSpeed;
    protected Engine engine;
    protected FuelTank fuelTank;

    public Vehicle(String brand, String model, int year, double maxSpeed, Engine engine, FuelTank fuelTank) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void displayInfo() {
        System.out.println("Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}');
    }

    public void startEngine(){
        System.out.println("Silnik uruchomiony");
    }

    public void refuel(double amount){
        if(fuelTank.getCurrentLevel() + amount > fuelTank.getCapaity()) fuelTank.currentLevel = fuelTank.capaity;
        else fuelTank.currentLevel += amount;
    }

    public void consume(double amount){
        if(amount <= fuelTank.getCapaity()) fuelTank.currentLevel -= amount;
        else fuelTank.currentLevel = 0;
    }
}
