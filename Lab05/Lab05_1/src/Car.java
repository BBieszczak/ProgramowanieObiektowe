public class Car extends Vehicle{
    public int passangerCapacity;

    public Car(Vehicle vehicle, int passangerCapacity) {
        super(vehicle.brand, vehicle.model, vehicle.year, vehicle.maxSpeed, vehicle.engine, vehicle.fuelTank);
        this.passangerCapacity = passangerCapacity;
    }

    public void displayInfo() {
        System.out.println("Marka: " + brand + ", model: " + model + ", rok: " + year + ", max. prędkość: " + maxSpeed + ", pojemność pasażerów: " +passangerCapacity);
    }
}

