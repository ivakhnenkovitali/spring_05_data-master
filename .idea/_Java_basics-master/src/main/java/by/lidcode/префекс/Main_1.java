package by.lidcode.префекс;

public class Main_1 {
    public static void main(String[] args) {
//Напишите функцию для поиска самой длинной общей строки префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку "".
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));//   String res = "fl";
    }
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0]; // Используем первый элемент в качестве начального префикса
       // System.out.println(prefix); //flower

        for (int i = 1; i < str.length; i++) {
           // System.out.println(str[i]);
            while (!str[i].startsWith(prefix)) {// проверяет полностью первый раз
                // Если следующий элемент не начинается с текущего префикса,
                // сокращаем префикс на один символ
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // Если префикс стал пустым, возвращаем пустую строку
                }
            }
        }
        return prefix;
    }

}
