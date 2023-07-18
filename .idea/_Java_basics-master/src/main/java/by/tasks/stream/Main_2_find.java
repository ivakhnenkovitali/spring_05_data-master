package by.tasks.stream;

import java.util.Arrays;
import java.util.List;

public class Main_2_find {
    public static void main(String[] args) {
        // Найти первое четное в списке целых чисел
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        Integer res = nums.stream()
                .filter(f -> f % 2 == 0)
                .findFirst().get();

        System.out.println(res);
    }
}
