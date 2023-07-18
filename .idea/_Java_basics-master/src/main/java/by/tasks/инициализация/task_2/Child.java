package by.tasks.инициализация.task_2;

public class Child extends Parent{
    static {
        System.out.println(3);
    }
    public Child(){
        System.out.println(4);
    }
}
