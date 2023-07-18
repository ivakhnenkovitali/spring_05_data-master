package by.lidcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Maint_arrays {
    public static void main(String[] args) {
        //Поиск максимального элемента в массиве
        int[] nums = {1, 7, 3, 9, 5};
        System.out.println("Maximum element: " + findMax(nums)); // Output: 9
        System.out.println("Maximum element: " + findMax1(nums)); // Output: 9

        //Найти сумму всех элементов массива
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sum(nums1)); // Output: 15

        //Разворот массива
        int[] nums2 = {1, 2, 3, 4, 5};
        reverse(nums2);
        System.out.print("Reversed array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        } // Output: 5 4 3 2 1

        reverse1(nums2);
        System.out.print("Reversed array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        } // 12345

        System.out.println();
        //Проверка на наличие дубликатов 2 способа
        int[] nums3 = {1, 2, 3,2};
        System.out.println("Contains duplicate: " + hasDuplicates(nums3)); // Output: true
        System.out.println("Contains duplicate: " + hasDuplicates1(nums3)); // Output: true

        System.out.println();
        // Удаление элемента из массива
        int[] nums4 = {1,2,3,4,5,6};
       nums4 =  deleteByIndex(nums4,3);
        for (int i : nums4){
            System.out.println(i); // 123 56
        }
        System.out.println();
        int[] nums5 = {1,2,3,4,5,6};
       ArrayList<Integer> res = deleteByIndexArrayList(nums5,1);
        System.out.println(res);//23456


    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int findMax1(int[] nums) {
        int max = nums[0];
        for (int i : nums) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void reverse(int[] arr) {
        int temp = 0;
        int last = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }
    }

    public static void reverse1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean hasDuplicates(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
           for (int j=1; j<arr.length; j++){
               if (x == arr[i]){
                   break;
               }
               return true;
           }
           x++;
        }
        return false;
    }
    public static boolean hasDuplicates1(int[] nums) {// будем добавлять в коллекцию по 1 элементу
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) { // проверяет есть ли этот элемент в коллекции
                return true;
            }
            seen.add(num); // если нет добавит
        }
        return false;
    }

    public static int[] deleteByIndex(int[] nums, int index){
        if (index < 0 || index >= nums.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        // Создание нового массива, размером на 1 меньше
        int[] newArray = new int[nums.length - 1];
        // Копирование элементов, пропуская тот, который нужно удалить
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i != index) {
                newArray[j++] = nums[i]; // Копируем элемент, если индекс не совпадает
            }
        }
        return newArray; // Возвращаем новый массив
    }
    public static ArrayList<Integer> deleteByIndexArrayList(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of bounds");
        }
       ArrayList<Integer> res = new ArrayList<>();
        for (int i : arr){
            res.add(i);
        }
        res.remove(index-1);
        return res;
    }
    public static int[] deleteByIndex1(int[] nums, int index) {
        if (index < 0 || index >= nums.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int[] newArray = new int[nums.length - 1];
        // Копирование элементов, пропуская тот, который нужно удалить
        for (int i = 0; i < newArray.length; i++) {
            if (i >= index) {
                newArray[i] = nums[i + 1]; // Сдвигаем элементы влево
            } else {
                newArray[i] = nums[i]; // Копируем элементы до индекса
            }
        }
        return newArray; // Возвращаем новый массив
    }
    public static int[] deleteByIndex2(int[] nums, int index) {
        // Проверка на валидный индекс !!!!
        return IntStream.range(0, nums.length)
                .filter(i -> i != index) // Пропускаем индекс, который нужно удалить
                .map(i -> nums[i])
                        .toArray(); // Создаем новый массив
    }



}

