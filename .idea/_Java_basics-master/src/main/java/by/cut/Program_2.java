package by.cut;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_2 {
    public static void main(String[] args) {
        //Преобразуйте список строк в одну строку через запятую, при этом сначала отсортируйте строки по длине, оставьте уникальные.
        //List<String> words = Arrays.asList("осень",  "лето", "зима", "весна", "лето");
        List<String> words = Arrays.asList("осень",  "лето", "зима", "весна", "лето");

        words.stream()
                .distinct()
                .sorted((a,b) ->a.length()-b.length())
                .collect(Collectors.joining(","));
    }
}
