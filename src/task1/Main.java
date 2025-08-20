package task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car1("A", "black", 60);
        Car car2 = new Car2();
        car2.setModel("B");
        car2.setColor("white");
        car2.setMaxSpeed(90);
        System.out.println(car1 + "\n" + car2);
        System.out.println(car1.gas());
        System.out.println(car1.brake());
        System.out.println(car2.gas());
        System.out.println(car2.brake());
    }
}
