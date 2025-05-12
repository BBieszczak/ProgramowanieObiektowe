public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("benzyna", 160);
        Engine engine2 = new Engine("CNG", 140);
        FuelTank fuelTank = new FuelTank(35, 20);
        FuelTank fuelTank2 = new FuelTank(45, 20);
        Vehicle vehicle = new Vehicle("Skoda", "GTR3000", 2002, 170, engine, fuelTank);
        Vehicle vehicle2 = new Vehicle("Ford", "Astra", 1998, 120, engine2, fuelTank2);
        Car car = new Car(vehicle, 5);
        Truck truck = new Truck(vehicle2, 2);

        truck.displayInfo();
        car.displayInfo();
        truck.startEngine();
        car.startEngine();
        truck.refuel(9);
        car.refuel(2);
        truck.consume(1);
        truck.consume(3);
    }
}