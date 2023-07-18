package by.tasks.инициализация.task_3;

public class A {
    void callBoth() {
        f1();
        f2();
    }

    private void f1() { // !!!!!!!! private!!!!!!!!!!!!!
        System.out.println("Af1");
    }

    protected void f2() { // !!!!!!!! protected!!!!!!!!!!!!!
        System.out.println("Af2");
    }

}
