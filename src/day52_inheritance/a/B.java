package day52_inheritance.a;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");
    }
}
