package by.tasks.String;

import java.util.Arrays;

public class Mаin_3_анаграмма {
    public static void main(String[] args) {
        // учитывая две строки s и t, верни true, если t является анограммой S. и false в противном случае,
        // Анограмма - это слово или фраза, образованные путем переставления букв другого слова или  фразы
        // обычно с использованием всех исходных букв ровно 1 раз

        String s = "anagramma";
        String t = "naagramma";
        System.out.println(isAnagramma(s, t));    // true

        String s1 = "rat";
        String t1 = "car";
        System.out.println(isAnagramma(s1, t1));      // false
    }

    public static boolean isAnagramma(String str1, String str2) {
        // Если длины строк разные, они не могут быть анограммами
        if (str1.length() != str2.length()) {
            return false;
        }

        // Сортируем обе строки и сравниваем
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
