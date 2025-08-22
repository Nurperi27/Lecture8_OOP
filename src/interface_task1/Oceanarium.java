package interface_task1;

import java.util.Arrays;

public class Oceanarium {
    Swimmable[] animals;
    int count = 0; //счетчик

    public Oceanarium(Swimmable[] animals, int count) {
        this.animals = animals;
        this.count = count;
    }

    public void addAnimals(Swimmable animal){
        if(count < animals.length){
            animals[count++] = animal;
        }
        for(Swimmable s : animals){
            if(s != null){
                s.swim();
            }
        }
    }

    @Override
    public String toString() {
        return "Oceanarium{" +
                "animals=" + Arrays.toString(animals);
    }
}
