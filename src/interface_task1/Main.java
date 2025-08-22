package interface_task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Создайте интерфейс Swimmable. Сoздайте 3 класса наследника (Shark, Duck, Turtle).
    //Создайте oкеанариум массив и вложите в него 5 shark, 5 duck и 5 turtle.
    public static void main(String[] args) {
        Oceanarium animals = new Oceanarium(15);
        for(int i=0; i<5; i++){
            animals.addAnimals(new Shark("Shark"));
        }
        for(int j=0; j<5; j++){
            animals.addAnimals(new Turtle());
        }
        for (int k=0; k<5; k++){
            animals.addAnimals(new Duck("Duck"));
        }
        animals.getInfo();
    }
}
