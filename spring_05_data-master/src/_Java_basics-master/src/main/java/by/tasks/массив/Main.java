package by.tasks.массив;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // определить содержит ли массив дубликаты
        int[] nums = {1, 5, 5,7, 0, 9};

        boolean res = containtDublicat(nums);
        if(res){
            System.out.println("Да");
        }else {
            System.out.println("нет");
        }
    }

    public static boolean containtDublicat(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) { // Если add вернет false, значит дубликат найден
                return true;
            }
        }
        return false;
    }
}
