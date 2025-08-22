package interface_oop;

public interface Swimmable {
    public static final String word = "T"; //always public static final
    static void staticMethod(){}
    default void defaultMethod(){}
    void method(); //abstract-default method //all methods always default-public and default-abstract method in interface: (public void method())/(abstract void method())

}
