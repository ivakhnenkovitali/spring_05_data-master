package by.tasks.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_6 {
    public static void main(String[] args) {
        // какой будет вывод
        var list = Stream.of("one", "two", "three")
                .peek(s -> s.replaceAll("o", "O")) // не отработает
                // принимает но ничего не возвращает
                .map(s -> s.replaceAll("e", "E"))  // сработает
                .collect(Collectors.toList());
        System.out.println(list); //[onE, two, thrEE]

    }
}
