package interface_task2;

import java.time.LocalDateTime;

public class Bun implements Backend{//булочка
    private String nameProduct;
    public Bun(){}
    public Bun(String nameProduct1) {
        this.nameProduct = nameProduct1;
    }
    @Override
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    @Override
    public String getNameProduct() {
        return nameProduct;
    }
    @Override
    public void numberOfSold() {
        System.out.println("Сегодня продано 90 хлеба из 100");
    }
    @Override
    public LocalDateTime cookingTime() {
        return LocalDateTime.of(2025, 8, 22, 6, 15);
    }
    @Override
    public LocalDateTime expiration() {
        return LocalDateTime.now();
    }
}
