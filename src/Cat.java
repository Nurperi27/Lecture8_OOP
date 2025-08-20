public class Cat extends Animal {
    public Cat(){}
    public Cat(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }

    @Override
    public void abstactMethod() { //Implement Method
        System.out.println("Cat child-class");
    }
}
