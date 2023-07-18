package by.tasks.stream;

import java.util.Arrays;
import java.util.List;

public class Main_7 {
    public static void main(String[] args) {
        // определить все ли числа в Stream не четные
        List<Integer> num = Arrays.asList(1,2,3,4,5);

        boolean res= num.stream()
                .allMatch(n->n %2 !=0);
        System.out.println(res); //false
    }
}
