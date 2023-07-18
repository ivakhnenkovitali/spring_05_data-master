package by.tasks.алгоритмы;

import java.util.Arrays;

public class Main_5 {
    public static void main(String[] args) {
        //Дан отсортированный массив целых чисел numbers и целое число target.
//Найдите индексы двух чисел, сумма которых равна target.
//Индексы должны быть различны и начинаются с 1

        int[]numbers = {1,2,7,11,15};  /// target = 9 -> [2,3]
        int target = 9;

        //2+7=9
        int[] result = findTwoIndex(numbers, target);
        System.out.println(Arrays.toString(result)); // Вывод: [1, 2]
    }
    public static int[] findTwoIndex(int[] numbers, int target) {
        int left = 0; // Указатель на начало массива
        int right = numbers.length - 1; // Указатель на конец массива

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1}; // Индексы с 1
            } else if (sum < target) {
                left++; // Увеличиваем левый указатель
            } else {
                right--; // Уменьшаем правый указатель
            }
        }
        return new int[] {}; // Если решение не найдено
    }
}
