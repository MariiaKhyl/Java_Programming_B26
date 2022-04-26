package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
        //System.out.println(obj.two);   protected - no inheritance ,  so no visibility
        //System.out.println(obj.three); default - visible in the same package
        //System.out.println(obj.four);  private

    }
}
