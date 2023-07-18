package by.lidcode;

import java.lang.reflect.Array;

public class Main_2 {
    public static void main(String[] args) {
        //Например,  2 записывается как II римская цифра, просто две единицы,
        // сложенные вместе. 12записывается как  XII, что просто X + II.
        // Число 27записывается как XXVII, что XX + V + II.
        //
        //Римские цифры обычно пишутся от большего к меньшему слева направо.
        // Однако цифра для четырех не IIII. Вместо этого число четыре записывается как IV.
        // Поскольку единица стоит перед пятью, мы вычитаем ее, получая четыре.
        // Тот же принцип применим к числу девять, которое записывается как IX.
        // Существует шесть случаев, когда используется вычитание:
        //
        //Iможно поместить перед V(5) и X(10), чтобы получить 4 и 9.
        //Xможно поместить перед L(50) и C(100), чтобы получить 40 и 90.
        //Cможно разместить перед D(500) и M(1000), чтобы получить 400 и 900.
        //Данную римскую цифру преобразуйте в целое число.
        String s = "XVI"; //
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int res = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {//справа налево!!!!!!!!!!!!!!!!!!!
            char currentChar = s.charAt(i);
          //  System.out.println("currentChar " + currentChar); //I V
            int currentValue = romanCharToInt(currentChar);
         //  System.out.println("currentValue " + currentValue);//1 5

            if (currentValue < prevValue) {
                res -= currentValue;
            } else {
                res += currentValue;//0+1=1  //1+5=6
            }
            prevValue = currentValue; //1    //6
        }
        return res;
    }
    public static int romanCharToInt(char s) {
        switch (s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
