package interface_task1;

import java.util.Arrays;

public class Oceanarium {
    Swimmable[] animals;
    int count = 0; //счетчик
    public Oceanarium(){}
    public Oceanarium(int length) {
        animals = new Swimmable[length];
    }
    public void addAnimals(Swimmable animal){
        if(count < animals.length){
            animals[count++] = animal;
        }
    }
    public void getInfo(){
        for(Swimmable s : animals){
            System.out.println(s.swim());
        }
    }
    @Override
    public String toString() {
        return "Oceanarium{" +
                "animals=" + Arrays.toString(animals);
    }
}
