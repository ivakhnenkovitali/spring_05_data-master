package by.tasks.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_3 {
    public static void main(String[] args) {
        //преобразуйте список строк в одну строку через запятую
        // при этом сначала отсортируйте по длинне, остальное уникальные
        List<String> words = Arrays.asList("осень", "лето","зима", "весна","лето");
        String str = words.stream()
                .distinct()  //осень", "лето","зима", "весна"
                .sorted((a,b) ->Integer.compare(a.length(),b.length())) //лето зима осень весна
               // .peek(System.out::println)
                .collect(Collectors.joining(", ")); //лето, зима, осень, весна
        System.out.println(str);

    }
}
