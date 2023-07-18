package by.tasks.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.sort;

public class KS {
    public static void main(String[] args) {
        // преобразовать входной список так,
        // чтобы первым вывелся символы k и s, а потом в отсортированном виде
        List<String> list = List.of("f", "z", "y", "k", "t", "r", "s", "a");
        System.out.println(makeKsFirstAndSort(list));
        System.out.println(makeKsFirstAndSort1(list));
    }

    // вариант решения 1
    public static List<String> makeKsFirstAndSort(List<String> list) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (String s : list) {
            if (s.equals("k") || s.equals("s")) {
                list1.add(s);
            } else {
                list2.add(s);
            }
        }
       // Collections.sort(list2);
        sort(list2);
        list1.addAll(list2);
        return list1;
    }

    // делим лист на два листа
    // в одном будет k и s
    // в другом остальные
    // объединяем [k, s, a, f, r, t, y, z]


    public static List<String> makeKsFirstAndSort1(List<String> list) {
        // Сначала фильтруем и собираем 'k' и 's', а затем фильтруем остальные символы
        List<String> result = Stream.concat( //для объединения двух потоков (streams) в один
                list.stream().filter(s -> s.equals("k") || s.equals("s")), // Фильтруем k и s
                list.stream().filter(s -> !s.equals("k") && !s.equals("s")) // Фильтруем остальное
                        .sorted() // Сортируем остальное
        ).collect(Collectors.toList()); // Собираем в новый список
        return result;
    }
}
