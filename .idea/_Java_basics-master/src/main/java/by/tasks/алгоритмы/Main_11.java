package by.tasks.алгоритмы;

import java.util.Arrays;
import java.util.HashMap;

public class Main_11 {
    public static void main(String[] args) {
        // Учитывая массив целых чисел nums и  целочисленную цель, верните индексы двух чисел так,
        // чтобы их сумма составляла цель
        //Вы можете предположить, что каждый вход будет иметь ровно одно решение и
        // вы не можете использовать один и тот же элемент дважды
        // Вы можете вернуть ответ в любом порядке

        int[] nums = {2, 7, 11, 15};   // target = 9  - [0,1]  => [0] = 2 [1]=7  2+7=9

        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSum1(nums,target)));

    }
// для отсортированного массива
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right =numbers.length-1;
    //    System.out.println(right); // 3
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left, right};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[0];
    }
    // для любого массива
 //   сложность составляет O(n), что эффективно.КопироватьПоделиться с друзьями
    public static int[] twoSum1(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i]; // ищем дополнение
            if (map.containsKey(complement)) { // если дополнение уже в map
                return new int[]{map.get(complement) + 1, i + 1}; // возвращаем индексы
            }
            map.put(numbers[i], i); // добавляем текущее число и его индекс
        }
        return new int[0]; // если не нашли
    }
}