package by.liveCoding_1;

public class Main_3 {
    public static void main(String[] args) {
        // Напишите Java-программу, чтобы найти второе по величине число в массиве

        int[] numbersArray = {10, 15, 32, 100, -99, 11, 98, 36, 95, 33, 100}; // 98 100
        int max = Integer.MIN_VALUE; //
        int max2 = Integer.MIN_VALUE;

        for (int i : numbersArray) {
            if (i > max) {
                max2 = max;
                max = i;//100
            } else if (max2 < i && i < max) {
                max2 = i;
            }
//если 100 и 100 он ничего не делает
        }
        System.out.println(max2);


    }
}
