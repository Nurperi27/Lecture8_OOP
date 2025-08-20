public class Dog extends Animal{
    public Dog(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }
    public Dog(){}
    @Override
    public void abstactMethod() { //Implement method
        System.out.println("Dog child-class");
    }
}
