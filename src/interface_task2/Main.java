package interface_task2;

public class Main {
    //Cоздайте интерфейс Backend. Создайте 3 класса наследника (Хлеб, Пирог, Булочка).
    // Классы наследники должны переопределить методы интерфейса Backend.
    public static void main(String[] args) {
        Backend bread = new Bread("Bread");
        System.out.println(bread.getNameProduct());
        bread.numberOfSold();
        System.out.println("Дата изготовления: " + bread.cookingTime() + "\nДата истечения срока годности: " + bread.expiration());
        System.out.println("_____________________________________________");
        Backend bun = new Bun();
        bun.setNameProduct("Bun");
        System.out.println(bun.getNameProduct());
        bun.numberOfSold();
        System.out.println("Дата изготовления: " + bun.cookingTime() + "\nДата истечения срока годности: " + bun.expiration());
        System.out.println("_____________________________________________");
        Backend pie = new Pie();
        System.out.println(pie.getNameProduct());
        pie.numberOfSold();
        System.out.println("Дата изготовления: " + pie.cookingTime() + "\nДата истечения срока годности: " + pie.expiration());
    }
}
