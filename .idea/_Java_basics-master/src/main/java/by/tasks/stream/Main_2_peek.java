package by.tasks.stream;

import java.util.stream.Stream;

public class Main_2_peek {
    public static void main(String[] args) {
        Stream.of(1,2,3,4)
                .filter(f->f%2 == 0)
                .peek(System.out::println);
        // ничего не выведит т,к, это не терминальная операция
              // .toList(); // 2,4


    }
}
