package by.tasks.алгоритмы;

public class Main_7 {
    public static void main(String[] args) {
        // Определить и вывести в log наибольшее число. Если все три числа равны - вывести "are equals".
// Использовать тернарный оператор для реализации логики.
// условие ? если да : если нет

        int a = 5;
        int b = 10;
        int c = 7;
        printMaxNumber(a, b, c);


    }

    public static void printMaxNumber(int a, int b, int c) {
        System.out.println(a == b && b == c ? "are equals" : (a > b && a > c ? a : (b>c && b>a ? b : c)));
        // или
        System.out.println(a == b && b == c ? "are equals" : (a > b && a > c ? a : (c>b && c>a ? c : b)));

    }
}
