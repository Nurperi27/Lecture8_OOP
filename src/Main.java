//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("A", 4, "b", "a");
        Dog dog1 = new Dog();
        //методы передаются с помощью абстактр класса даже если в child классе ничего нет
        dog1.setName("B");
        dog.setAge(2);
        dog1.setColor("bb");
        dog1.setBreed("b");
        System.out.println(dog1);
        Animal cat = new Cat(); //polymorphism
        //
    }
}