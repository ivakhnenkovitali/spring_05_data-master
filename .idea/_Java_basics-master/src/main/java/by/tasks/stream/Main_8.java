package by.tasks.stream;

import java.util.Arrays;
import java.util.List;

public class Main_8 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4);

        Integer res = num.stream()
                .filter(f -> f % 2 == 0)
                .findFirst()
                .get();
        // вместо get
        //  .orElse(-1);
        // или .ifPresent(res -> System.out.println("Первое четное число: " + res));
    }
}
