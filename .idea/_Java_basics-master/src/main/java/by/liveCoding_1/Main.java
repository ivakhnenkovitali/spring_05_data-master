package by.liveCoding_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 3 4 6 8 5 10 8 6 6 4
        // вывести на экран все четные кроме 4: hello число - количество повторений

       /* Map<String, List<Integer>> collect = Stream.of(3, 4, 6, 8, 5, 10, 8, 6, 6, 4)
                .filter(s -> s != 4)
                .filter(s -> s % 2 == 0)
                .collect(Collectors.groupingBy(s -> "Hello" + s));

        System.out.println(collect);
*/
        List<Sale> sales = Arrays.asList(
                new Sale("Laptop", "Electronics", 1000, 1),
                new Sale("Smartphone", "Electronics", 500, 2),
                new Sale("Chair", "Furniture", 150, 5),
                new Sale("Desk", "Furniture", 300, 1),
                new Sale("Pen", "Stationery", 1, 100),
                new Sale("Notebook", "Stationery", 2, 50)
        );

        Map<String, Double> collect1 = sales.stream()
                .collect(Collectors.groupingBy(s -> s.category, Collectors.summingDouble(sale -> sale.price * sale.quantity)));

        collect1.entrySet().stream()
                .filter(s->s.getValue()>=100)
              //  .sorted((a,b) ->(int)(b.getValue() - a.getValue()))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);





    }
    //
//### Задача: Анализ продаж
//**Условие:** Дано список объектов класса `Sale`, представляющего информацию о продажах.
// Каждый объект содержит данные о названии продукта, категории, цене и количестве.
// Напишите программу, которая:
//
//            1. Сгруппирует продажи по категории продукта.
//            2. Для каждой категории вычислит общую сумму продаж (цена * количество).
//            3. Отфильтрует категории, у которых сумма продаж меньше 100.
//            4. Отсортирует оставшиеся категории по общей сумме продаж в порядке убывания.
//            5. Выведет название категории и общую сумму продаж для оставшихся категорий.

    static class Sale {
        String productName;
        String category;
        double price;
        int quantity;

        Sale(String productName, String category, double price, int quantity) {
            this.productName = productName;
            this.category = category;
            this.price = price;
            this.quantity = quantity;
        }

        public String getCategory() {
            return category;
        }

        public double getTotalSale() {
            return price * quantity;
        }
    }


}
