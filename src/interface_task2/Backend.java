package interface_task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public interface Backend {
    void setNameProduct(String name);
    String getNameProduct();
    void numberOfSold(); //количество проданных
    LocalDateTime cookingTime(); //время готовки
    LocalDateTime expiration(); //истечение срока годности
}
