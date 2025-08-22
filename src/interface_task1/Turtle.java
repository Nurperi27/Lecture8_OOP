package interface_task1;

public class Turtle implements Swimmable{
    private final String nameAnimal = "Turtle";
    @Override
    public void setNameAnimal(String nameAnimal){ }
    @Override
    public String getNameAnimal() {
        return nameAnimal;
    }
    @Override
    public void swim() {
        System.out.println(nameAnimal + " can sleep underwater for 4-7 hours");
    }
}
