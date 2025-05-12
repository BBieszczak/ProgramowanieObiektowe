public class Truck extends Vehicle{
    public double loadCapacity;

    public Truck(Vehicle vehicle, double loadCapacity) {
        super(vehicle.brand, vehicle.model, vehicle.year, vehicle.maxSpeed, vehicle.engine, vehicle.fuelTank);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        System.out.println("Marka: " + brand + ", model: " + model + ", rok: " + year + ", max. prędkość: " + maxSpeed + ", ładowność: " + loadCapacity);
    }
}