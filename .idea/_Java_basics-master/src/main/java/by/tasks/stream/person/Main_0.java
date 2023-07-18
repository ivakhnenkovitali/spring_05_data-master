package by.tasks.stream.person;

import java.util.stream.Stream;

public class Main_0 {
    public static void main(String[] args) {
        var list = Stream.of("one", "two","three")
                .peek(s->s.replaceAll("o","O"))
                //позволяет выполнять действия по отношению к элементам потока, но не изменяет их
                //действительно заменяет 'o' на 'O', но результат не сохраняется
                // .map(s -> s.replaceAll("o", "O")) // Сначала замените 'o' на 'O'
                .map(s -> s.replaceAll("e","E"))
                .toList();
        System.out.println(list);
    }
}
