package task1;

public class Car2 extends Car{
    public Car2(){}

    public Car2(String model, String color, double maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public String gas() {
        return getModel() + " moved!";
    }

    @Override
    public String brake() {
        return getModel() + " stopped!";
    }

}
