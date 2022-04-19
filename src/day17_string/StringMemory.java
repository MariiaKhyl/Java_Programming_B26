package day17_string;

public class StringMemory {

    public static void main(String[] args) {

        String first = "java";// String literal, in String pool
        String second = new String("java");//String object, not in String pool, but directly in the heap

        System.out.println(first == second);
        //  == with String types gives you false. The == doesn't compare the characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first == third);

        String fourth = "Java";
        System.out.println(first == fourth);


    }


}
