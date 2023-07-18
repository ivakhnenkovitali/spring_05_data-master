package by.cut;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_1 {
    public static void main(String[] args) {
        Stream.of(3, 4, 2, 1, 5)
                .peek(System.out::println)//3,4,2,1,5
                .sorted()
                .peek(System.out::println)
                .findFirst(); // 1
    }
}
