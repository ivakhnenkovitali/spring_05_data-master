package by.liveCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>(Arrays.asList("iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                "Lenovo S 850")); // 10

        int pageSize = 2; // количество элементов на страницу

        int pageNumber = 3; // номер страницы

        phones.stream()
                .skip((pageNumber-1)*pageSize)
                .limit(pageSize)
                .forEach(System.out::println);



    }
}
