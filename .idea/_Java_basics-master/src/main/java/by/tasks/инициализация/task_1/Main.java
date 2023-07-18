package by.tasks.инициализация.task_1;

import by.tasks.инициализация.task_1.B;

public class Main {
    public static void main(String[] args) {
        new A();  // 2
      // new B();

        // вызываем конструктор B а он вызовет А
        //в конструкторе А вызоветля метод из В
        // попросит вывести длинну строки, но переменная еще не проиницализировалась
        // => NullPointerException
    }
}
