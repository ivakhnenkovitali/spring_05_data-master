package by.tasks.String;

import java.util.Arrays;

public class Main_33 {
    public static void main(String[] args) {
        // есть строка проверить ваидна она или нет
        // "(((())))" - валидна
        // "()()()" - валидна
        // "(()" - не валидна
        // ")(" - не валидна
        System.out.println(checkString("(((())))"));
        System.out.println(checkString("()()()"));
        System.out.println(checkString("(()"));
        System.out.println(checkString(")("));

    }

    public static boolean checkString(String str) {
        if (str.startsWith(")")) return false;

        char[] str1 = str.toCharArray();
        System.out.println("str1 " + Arrays.toString(str1));

        int open = 0;
        int close = 0;

        for (char ch : str1) {
            if (ch == '(') {
                open ++;
            }
            if (ch == ')') {
                close ++;
            }
        }
        if (open==close){
            return true;
        }
        return false;
    }
}
