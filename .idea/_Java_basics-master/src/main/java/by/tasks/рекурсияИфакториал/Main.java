package by.tasks.рекурсияИфакториал;

public class Main {
    public static void main(String[] args) {
        // Дана строка в нижнем регистре с встречающейся последовательностью hi
        // Написать рекрусивную функцию , которая будет считать общее число таких последовательностей в строке
        // пример xxxxxxhixxxhihi => 3
        String str = "xxxxxxhixxxhihi";
        int count = countHi(str);
        System.out.println(count);

    }

    public static Integer countHi(String str) {
// Базовый случай: если строка меньше 2, "hi" не может присутствовать
        if (str.length() < 2) {
            return 0;
        }

        // Проверка на наличие "hi" в начале строки
        if (str.startsWith("hi")) {
            // Увеличиваем счетчик на 1 и продолжаем поиск с позиции 2
            return 1 + countHi(str.substring(2));
        } else {
            // Если "hi" не найдено, продолжаем поиск с позиции 1
            return countHi(str.substring(1));
        }
    }
//Проверка на "hi"**: Если строка начинается с "hi", мы увеличиваем счетчик на 1 и вызываем `countHi` с подстрокой,
//начиная с 2-го индекса (чтобы исключить уже найденную пару "hi").
//Продолжение поиска**: Если "hi" не найдено, мы продолжаем искать с подстроки, начиная с 1-го индекса.
}
