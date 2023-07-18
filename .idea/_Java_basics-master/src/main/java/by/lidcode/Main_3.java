package by.lidcode;

import java.util.Arrays;

public class Main_3 {
    public static void main(String[] args) {
         String s = "({)}";//false
         String s1 = "({})";// true
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
    }
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) { // Проверка на четность длины строки
            return false; // Если длина нечетная, скобки не могут быть сбалансированными
        }
        int c1 = 0;//()
        int c2 = 0;//{}
        int c3 = 0;//[]

        String[] str = s.split(""); // строку разбиваем на массив "" - без пробела
     //   System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            switch (s.charAt(i)) {
                case '(': c1++; break;
                case '[': c2++; break;
                case '{': c3++; break;
                case ')': if (c1 > 0) { // Проверяем, есть ли открывающая скобка
                    c1--;
                } else {
                    return false; // Нет открывающей, значит, не сбалансировано
                }
                    break;
                case ']': if (c2 > 0) {
                    c2--;
                } else {
                    return false;
                }
                    break;
                case '}':if (c3 > 0) {
                    c3--;
                } else {
                    return false;
                }
                    break;
            }
        }

        return c1 == 0 && c2 == 0 && c3 == 0;
    }
}


//            if (str[i].equals("(")) {
//                c1++; //1
//            } else if (str[i].equals("[")) {
//                c2++;
//            } else if (str[i].equals("{")) {
//                c3++;//1
//            } else if (str[i].equals(")")) {
//                c1--;
//            } else if (str[i].equals("]")) {
//                c2--;
//            } else if (str[i].equals("}")) {
//                c3--; //-1
//            }