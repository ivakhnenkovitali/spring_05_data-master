package by.lidcode.палиндром;

import java.util.Arrays;

public class main_2_палиндром {
    public static void main(String[] args) {
        // является ли строка палиндромом
        //Палиндром — это слово, фраза, число или другая последовательность символов, которые читаются одинаково в обоих направлениях, то есть слева направо и справа налево. Примеры палиндромов включают:
        //
        //- Слова: "радар", "казак", "дед"
        //- Фразы: "Я несу гусеня", "А роза упала на лапу Азора"
        //- Числа: 121, 12321

        String palindrome = "A man, a plan, a canal: Panama";
        Boolean res = isPalindrome(palindrome);
        System.out.println(res);

    }

    // 1. Игнорировать регистр букв (т.е. делать все буквы нижнего регистра).
    // 2. Игнорировать пробелы, знаки препинания и другие символы, не относящиеся к буквам.
    public static boolean isPalindrome(String str) {
        // Убираем все не буквенно-цифровые символы и приводим к нижнему регистру
        String cleaned = str.replaceAll("[^А-Яа-я]", "").toLowerCase();

        // Создаем обратную версию строки вручную
//        String reversed = "";
//        for (int i = cleaned.length() - 1; i >= 0; i--) {
//            reversed += cleaned.charAt(i);
//        }
        // Сравниваем оригинальную строку с её обратной версией
     ///   return cleaned.equals(reversed);

        // Сравниваем строку с ее обратной версией
//        StringBuilder cope = new StringBuilder(cleaned).reverse();
//        return cleaned.equals(cope);

      return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
