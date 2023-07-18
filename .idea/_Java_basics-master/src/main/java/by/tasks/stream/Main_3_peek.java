package by.tasks.stream;

import java.util.Arrays;

public class Main_3_peek {
    public static void main(String[] args) {
        //`peek` — это промежуточная операция, которая используется для "подсмотривания" текущих элементов потока.
        // Какой буддет ответ
        Arrays.stream(new int[]{1, 4, 3})  //- Здесь создаётся поток целых чисел из массива `{1, 4, 3}`.

                .peek(System.out::println) // 1,4,3
                .sorted() // 1,3,4
                .peek(System.out::println) //1,3,4
                .anyMatch(i -> i == 3); // true // 1,4,3,1,3
                    //  .findAny();// 1.4.3.1


        System.out.println("//////////////////////////////");
        Arrays.stream(new int[]{1, 4, 3})  //- Здесь создаётся поток целых чисел из массива `{1, 4, 3}`.

                .peek(System.out::println)
                .peek(System.out::println)
                .anyMatch(i -> i == 3); // 114433 true
    }
}
