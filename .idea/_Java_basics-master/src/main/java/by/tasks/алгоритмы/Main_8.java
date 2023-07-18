package by.tasks.алгоритмы;

import java.util.ArrayList;
import java.util.List;

public class Main_8 {
    public static void main(String[] args) {
        // Есть массив с двумя нулями. Вывести в log через пробел обратном порядке как они идут все числа,
// которые находятся между нулями (нули выводить не нужно).

        int[] arrayWithZeros = {5, 7, 11, 4, 0, 12, 9, 7, 14, 0, 13, 2};
        getNumbersBetweenZeros(arrayWithZeros); // 14 7 9 12

    }
    public static void getNumbersBetweenZeros(int[] arr){
        int firstZeroIndex = -1;
        int secondZeroIndex = -1;

       // Находим индексы первых двух нулей
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i; // Запоминаем индекс первого нуля
                } else {
                    secondZeroIndex = i; // Запоминаем индекс второго нуля
                    break; // Выходим из цикла, так как нашли оба нуля
                }
            }
        }
// Если оба нуля найдены
        if (firstZeroIndex != -1 && secondZeroIndex != -1 && secondZeroIndex > firstZeroIndex + 1) {
            // Создаем список для хранения чисел между нулями
            List<Integer> numbersBetween = new ArrayList<>();
            for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
                numbersBetween.add(arr[i]); // Добавляем элементы между нулями
            }

            // Выводим числа в обратном порядке
            for (int i = numbersBetween.size() - 1; i >= 0; i--) {
                System.out.print(numbersBetween.get(i) + " ");
            }
         }
    }
}

