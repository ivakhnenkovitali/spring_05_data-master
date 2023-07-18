package by.lidcode.палиндром;

public class Main_1 {
    public static void main(String[] args) {
        int x = -10; //-121 и 10
        boolean res = isPalindrom(x);
        System.out.println(res);
    }
    public static boolean isPalindrom(int x){
        // Если число меньше 0 или оканчивается на 0 (кроме нуля),
        // то оно не может быть палиндромом.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        int originalX = x;

        // Пока исходное число x больше 0, выполняем следующие действия:
        while (x > 0) {
            reversedNum = reversedNum * 10 + x % 10; // return originalX == reversedNum;
            x /= 10; // - Уменьшаем исходное число x
        }
        // Сравнение исходного числа x с перевернутым числом reversed_num.
        return originalX == reversedNum;
    }


    // массив
    // строка
    // число
}
