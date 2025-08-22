package interface_oop;

public class Main {
    public static void main(String[] args) {
        Swimmable shark = new Shark("A");
        shark.method();
        System.out.println(shark);
        Attactable attactable = new Shark("B");
        attactable.attact();

    }
}
