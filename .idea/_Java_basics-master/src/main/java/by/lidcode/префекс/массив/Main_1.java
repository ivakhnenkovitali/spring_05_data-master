package by.lidcode.префекс.массив;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_1 {
    public static void main(String[] args) {
//        Даны два отсортированных массива arr1 и arr2.
//        Нужно создать новый отсортированный массив, содержащий все элементы из arr1 и arr2.
//          [1, 1, 2, 3, 4, 4]

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

       // int[] res= new int[arr1.length + arr2.length];

        Integer[] mergedArray = addArray(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));

//        int [] newArray = new int[]{2,6,1,3,5,1};
//        Arrays.sort(newArray);
//        System.out.println(Arrays.toString(newArray));

        System.out.println(Arrays.toString(addArray(arr1,arr2)));
    }
    public static Integer[] addArray(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        // Копируем элементы из arr2 в newArray
        for (int j = 0; j < arr2.length; j++) {
            newArray[arr1.length + j] = arr2[j];
        }
        Arrays.sort(newArray);
        Set<Integer> set =new HashSet<>();
        for (int i : newArray){
            set.add(i);
        }
        // Преобразуем Integer[] в int[]
//        int[] intArray = new int[arrayFromSet.length];
//        for (int i = 0; i < arrayFromSet.length; i++) {
//            intArray[i] = arrayFromSet[i]; // Автоматическая распаковка Integer в int
//        }

        // Индексы для прохода по массивам
//        int i = 0; // Индекс для arr1
//        int j = 0; // Индекс для arr2
//        int k = 0; // Индекс для newArray
//
//        // Проходим по обоим массивам, пока один из них не будет пройден полностью
//        for (k = 0; k < newArray.length; k++) {
//            if (i < arr1.length && (j > arr2.length || arr1[i] <= arr2[j])) {
//                newArray[k] = arr1[i];
//                i++;
//            } else {
//                newArray[k] = arr2[j];
//                j++;
//            }
  //          System.out.println(Arrays.toString(newArray));
  //      }
        return set.toArray(new Integer[0]);
    }
}
