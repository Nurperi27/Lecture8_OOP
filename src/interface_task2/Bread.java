package interface_task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Bread implements Backend { //хлеб
    private String nameProduct;
    public Bread(){}
    public Bread(String nameProduct1) {
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
        System.out.println("Сегодня продано 35 хлеба из 50");
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
