package day15_16_04_05_06_2022;

public class P01_WrapperClass {
    public static void main(String[] args) {

        /*
        - Collection allows only OBJECTS (non_primitive)
                    String, Integer, Scanner, etc

        - Collection --> Arraylist etc
        = Wrapper classes has many useful methods

        - Character.isDigit()
        - Character.isUpperCase()
        - Character.isLowerCase()
        - valueOf() vs parseInt() / parseDouble() etc

        - To convert primitives to OBJECT

        - Autoboxing - primitive to OBJECTS
        - Unboxing - OBJECTS to primitive
         */

        // - Autoboxing - primitive to OBJECTS
        Integer a =new Integer(30);
        Integer b = 30; //they are the same

        // - Unboxing - OBJECTS to primitive
        Integer c = Integer.valueOf(30);
        int d = c; // Unboxing

        // - valueOf() vs parseInt() / parseDouble() etc

        // - valueOf()  - returns Object (Wrapper Class)
        // -parseInt() / parseDouble() - returns primitive

        int e =Integer.parseInt("123"); // returns primitive

        Integer f = Integer.valueOf(123);

        // Wrapper Classes Methods

        System.out.println(Character.isDigit('a'));  // false
        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.isLowerCase('a')); // true

        // Casting is not possible with Wrapper Classes

        Integer num = Integer.valueOf(123);
        // Double doub = num;



    }
}
