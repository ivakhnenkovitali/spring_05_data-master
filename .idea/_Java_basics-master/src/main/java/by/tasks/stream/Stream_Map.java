package by.tasks.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_Map {
    public static void main(String[] args) {
        //Необходимо найти сумму всех чисел, начиная с пятого по порядку, которые делятся на 3 или 5.
// Но есть дополнительное условие: если таких чисел больше 10, то складываешь только первые 10 из них.
//================================================================================
     /*   List<Integer> numbers = Arrays.asList(1, 15, 2, 3, 7, 20, 8, 9, 12, 5, 30, 4, 11, 18, 25);

        numbers.stream()
                .skip(5)
                .filter(s->s%3 ==0 ||s%5 == 0)
                .limit(10)
                .sum();



// ================================================================================
//У вас есть список заказов, где каждый заказ имеет идентификатор клиента и сумму заказа.
//Необходимо сгруппировать заказы по клиентам и вычислить общую сумму заказов для каждого клиента.
//================================================================================
/*
public class Order {
    int clientId;
    double amount;

    public Order(int clientId, double amount) {
        this.clientId = clientId;
        this.amount = amount;
    }
}
*/

 /*       List<Order> orders = Arrays.asList(
                new Order(1, 100.00),
                new Order(2, 200.00),
                new Order(1, 150.00),
                new Order(3, 300.00)
        );

        Map<Integer, Double> res = orders.stream()
                .collect(Collectors.groupingBy(order -> order.getClienId(), Collectors.summingDouble(or -> or.getAmount()));
//================================================================================
//Предположим, у вас есть список студентов, каждый из которых имеет уникальный идентификационный номер (ID),
//имя и средний балл. Необходимо создать Map, где ключом будет ID студента, а значением — его имя.
//================================================================================
/*
public class Student {
    int id;
    String name;
    double average;

    public Student(int id, String name, double average) {
        this.id = id;
        this.name = name;
        this.average = average;
    }
}
*/


  /*      List<Student> students = Arrays.asList(
                new Student(1, "Алексей", 3.5),
                new Student(2, "Мария", 3.8),
                new Student(3, "Сергей", 3.9)
        );
        Map<Integer, String> res = students.stream()
                //Stream<Student>
                .collect(Collectors.toMap(student -> student.getId());
// ================================================================================
//Дано: бесконечный стрим элементов от 1 до 255. Задача: при помощи стримов
//посчитать количество вхождений каждого уникального проходящего через стрим числа,
//ограничив стрим на 600 элементах
//================================================================================
        Stream.iterate(0, i -> 1 + (int) (Math.random() * (255 - 1) + 1))
                .limit(600)
                .collect(Collectors.groupingBy(number -> number, Collectors.counting());


//================================================================================
//Реализовать метод, который отсортирует все четные элементы входящего листа по возрастанию,
//а нечетные оставит на своих местах
//================================================================================
        //(1, 4, 5, 2) - вход
                //(1, 2, 5, 4) - выход

        public static List<Integer> someWeirdSorting(List <Integer> list2) {
            List<Integer> evenNumbers = list2.steam() //(1, 4, 5, 2)
                    .filter(s-> s % 2 == 0) //(4, 2)
                    .sorted() // 2, 4
                    .toList();

            Iterator<Integer> evenIter = evenNumbers.iterator();
            //evenIter.next() -- 2
            //evenIter.next() -- 4

            //(a) -> a.getName()
            //
        List<Integer> list1 = Arrays.asList(1,2,5,4);
            return list1.stream() //(1, 2, 5, 4)
                    .map(s -> {
                                if (s % 2 == 0) {
                                    return evenIter.next();
                                } else {
                                    return s;
                                }
                            }
                    ).toList();
        }
*/
    }
}
