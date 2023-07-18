package by.tasks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main_1 {
    public static void main(String[] args) {
        // дан список целых чисел
        // для каждого числа вывести в консоль само число + количество его дубликатов

        List<Integer> list = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
        list.stream()
                //  .collect(Collectors.groupingBy(k->k))// сгруппировали
                .collect(Collectors.groupingBy(Function.identity()))// сгруппировали
                .forEach((k, v) -> {
                    System.out.println(k + " = " + v.size());// size выводит количество в массиве
                });
        //1 = 1
        //2 = 2
        //3 = 1
        //4 = 2
        //5 = 3
        //6 = 1

        //1 = [1]
        //2 = [2, 2]
        //3 = [3]
        //4 = [4, 4]
        //5 = [5, 5, 5]
        //6 = [6]

        System.out.println("-----------------------------");
        // Дан список из строк
        // Вывести общее число всех уникальных символов в строках
        List<String> list1 = List.of("abcaa", "bcde", "ccaa"); // => 5


        //Метод `count()` возвращает значение типа `long`, поэтому если вы попытаетесь использовать `int`,
        // вам нужно будет преобразовать `long` в `int`, что может привести к потере данных при переполнении.
        long distinctCount = list1.stream()
                .flatMap(x -> {
                    String[] s = x.split("");
                    return Arrays.stream(s);
                })
                .distinct()
                .count();
        System.out.println(distinctCount);


    }
}
