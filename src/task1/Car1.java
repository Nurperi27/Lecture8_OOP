package task1;

public class Car1 extends Car{
    public Car1(String model, String color, double maxSpeed) {
        super(model, color, maxSpeed);
    }
    public Car1(){}

    @Override
    public String gas() {
        return "Car1! Let's go!";
    }

    @Override
    public String brake() {
        return "Car1, Stop!";
    }
}
