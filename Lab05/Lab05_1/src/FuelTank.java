public class FuelTank {
    public double capaity;
    public double currentLevel;

    public FuelTank(double capaity, double currentLevel) {
        this.capaity = capaity;
        this.currentLevel = currentLevel;
    }

    public double getCapaity() {
        return capaity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void refuel(double amount){
        if(currentLevel + amount > capaity) currentLevel = capaity;
        else currentLevel += amount;
    }

    public void consume(double amount){
        if(amount <= currentLevel) currentLevel -= amount;
        else currentLevel = 0;
    }
}

