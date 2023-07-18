package by.tasks.алгоритмы;

import java.util.HashSet;
import java.util.Set;

public class Main_1 {
    public static void main(String[] args) {
        // как проверить есть ли там уникалые элементы
        int[] nums = {1, 5, 7, 0, 7, 9};

        boolean res = containsDuplicat(nums);
        System.out.println(res);
    }

    public static boolean containsDuplicat(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return false; // Найден дубликат
            }
        }
        return true;  // Все элементы уникальны

    }
}
