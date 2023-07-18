package by.tasks.инициализация.task_3;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B a3 = new B();
    //   B a4 = new A();

        a1.callBoth(); //Af1 Af2
        a2.callBoth(); //Af1 Bf2
        a3.callBoth(); //Af1 Bf2
    //    a4.callBoth();

// не могут быть переопределены: final, finalize()
//equals()` и `hashCode()`: хотя их можно переопределять, если они объявлены как final
// static методы
// Методы `private - не могут быть увидены классом-наследнико
// Конструкторы - не могут быть переопределены, поскольку они не наследуются


    }
}
