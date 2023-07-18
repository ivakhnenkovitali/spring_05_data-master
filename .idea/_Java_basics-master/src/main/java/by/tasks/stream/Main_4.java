package by.tasks.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_4 {
    public static void main(String[] args) {
        // У Вас есть 2 списка целых чисел , Объедините их  , отфильтруйте уникальные значения и выведите результат
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);

        // Объединяем оба списка, фильтруем уникальные значения и собираем результат в Set
        Set<Integer> uniqueNumbers =
                Stream.concat(nums1.stream(), nums2.stream()) // Объединяем потоки из двух списков
                        .collect(Collectors.toSet()); // Собираем результаты в Set для получения уникальных значений

        // Выводим на экран уникальные значения
        System.out.println(uniqueNumbers);
    }
}
