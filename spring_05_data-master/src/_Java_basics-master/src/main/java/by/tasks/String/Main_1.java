package by.tasks.String;

public class Main_1 {
    public static void main(String[] args) {
        // дана строка из скобок, Вывести true- если она валидна и false -  если ее формат нарушен
        // "((()))" - валидна, "(()()())" - валидна, "(()" - не валидна, ")(" - не валидна

        String str = "(()()())";
        boolean res = checkString(str);
        System.out.println(res);

    }

    public static boolean checkString(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            // Если в какой-то момент баланс отрицательный, строка не валидна
            if (count < 0) {
                return false;
            }
        }
        // если равны - true. если нет - false
      return count == 0;
        //return false;  НЕТ
    }
}
