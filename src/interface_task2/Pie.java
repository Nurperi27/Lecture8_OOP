package interface_task2;

import java.time.LocalDateTime;

public class Pie implements Backend{ //пирог
    private final String nameProduct = "Pie";
    @Override
    public void setNameProduct(String nameProduct){}
    @Override
    public String getNameProduct() {
        return nameProduct;
    }
    @Override
    public void numberOfSold() {
        System.out.println("Сегодня продано 60 хлеба из 60");
    }
    @Override
    public LocalDateTime cookingTime() {
        return LocalDateTime.of(2025, 8, 20, 6, 15);
    }
    @Override
    public LocalDateTime expiration() {
        return LocalDateTime.now();
    }
}
