package by.tasks.алгоритмы;

import java.util.Arrays;

public class Main_4 {
    public static void main(String[] args) {
        //Дан массив nums, переместите все нули в конец массива, сохраняя относительный порядок ненулевых элементов.
        int[] nums = {0,1,0,3,12}; // -> [1,3,12,0,0]

        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZeroes(int[] nums){
        int lastNonZeroIndex  = 0;

        for (int i=0; i<nums.length; i++){
            // если это не 0
            if(nums[i] !=0){
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
              //  System.out.println(nums[lastNonZeroIndex]);
                lastNonZeroIndex++;
              //  System.out.println(Arrays.toString(nums));
            }
        }
    }
}
