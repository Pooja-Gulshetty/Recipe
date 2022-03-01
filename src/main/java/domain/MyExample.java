package domain;

public interface MyExample {
    public void method1();
    public void method2();
}
class demo implements MyExample{
    public void method1()
    {
        System.out.println("implementation of method1");
    }
    public void method2()
    {
        System.out.println("implementation of method2");
    }
    public static void main(String arg[])
    {
        MyExample obj = new demo();
        obj.method1();
    }
}

