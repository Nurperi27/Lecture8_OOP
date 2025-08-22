package interface_oop;

public class Shark implements Swimmable, Attactable { //multiple inheritance
    private String name;

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void method() {//from Swimmable-interface
        System.out.println("Shark is swimming");
    }

    @Override
    public void attact() {
        System.out.println("Attact");
    }
}
