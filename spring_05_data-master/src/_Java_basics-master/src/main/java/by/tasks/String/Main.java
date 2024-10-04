package by.tasks.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Дан текст на русском
    // Длинна - не более NL символов
    // Длинна строки - не более NS символов
    // Длинна слова - не более NW символов
    // Текст заканчивается точкой
    // Составить процедуру которая, в заданном тексте находит слова оканчивающиеся заданной буквой
    // В качестве результата вывести исходный текст, найденные слова и их кол-во

    public static List<String> findWorld(String text, char endChar) {
        // список найденных слов
        List<String> resultWords = new ArrayList<>();

        // все слова в тексте
        String[] allWords = text.split("[\\s,!?]");

        for (String word : allWords) {
            if (word.endsWith(String.valueOf(endChar))) {
                resultWords.add(word);
            }
        }
        return resultWords;
    }

    // замена метода как вариант
    public static List<String> streamFindWorld(String text, char endChar) {
        return Arrays.stream(text.split("[\\s,!?]"))
                .filter(word->word.endsWith(String.valueOf(endChar)))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        String text = "Этот самолет вертолет не работает";
        char endChar = 'т';

        List<String> result = findWorld(text, endChar);

        System.out.println(text); // Этот самолет вертолет не работает
        result.forEach(System.out::println); //Этот самолет вертолет работает
        System.out.println(result.size()); //4

        System.out.println("-------------------");
        List<String> result1 = streamFindWorld(text, endChar);
        System.out.println(text);
        result1.forEach(System.out::println);
        System.out.println(result1.size());
    }
}
