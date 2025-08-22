package interface_task1;

public class Shark implements Swimmable {
    private String nameAnimal;
    public Shark(){}
    public Shark(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }
    @Override
    public void setNameAnimal(String nameAnimal){ this.nameAnimal = nameAnimal; }
    @Override
    public String getNameAnimal() {
        return nameAnimal;
    }
    @Override
    public void swim() {
        System.out.println(nameAnimal + " в среднем плавают со скоростью 8км/ч");
    }
}
