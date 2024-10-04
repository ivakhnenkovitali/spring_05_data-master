package by.tasks.сравнение;

public class Main_1 {
    public static void main(String[] args) {

        System.out.println(new String("Hi_5") == "Hi_" + 5); //false

        Integer i1 =127;
        int i2 = 127;
        Integer i3 =127;
        Integer i4 =128;
        Integer i5 =128;
        int i6 = 128;

        int i7 = 129;
        Integer i8 = 129;

        System.out.println(i1==i2);  // true
        System.out.println(i1==i3);  // true
        System.out.println(i2==i3);  // true
        System.out.println(i4==i5);  // false

        //Java автоматически распаковывает объект `Integer` в примитивный тип `int`.
        //значение сравнивается после распаковки.
        System.out.println(i5==i6);  // true
        System.out.println(i7==i8);  // true


    }
}
