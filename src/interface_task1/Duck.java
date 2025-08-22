package interface_task1;

public class Duck implements Swimmable{
    private String nameAnimal;
    public Duck(){}
    public Duck(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
    @Override
    public void setNameAnimal(String nameAnimal){ this.nameAnimal = nameAnimal; }
    @Override
    public String getNameAnimal() {
        return nameAnimal;
    }
    @Override
    public String swim() {
        return nameAnimal + " relaxed swimming on the water";
    }
}
