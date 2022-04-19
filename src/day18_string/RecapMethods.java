package day18_string;

public class RecapMethods {

    public static void main(String[] args) {

        String s = "pen";// a is a String literal, so it is in the String pool
        String s2 = new String ("pen"); // s2 is object in the heap, because we use new

        System.out.println("Compare with == "+(s == s2));
        System.out.println("Compare with .equals() " + (s.equals(s2)));

        System.out.println("Compare with .equals()" +s.equals("Pen"));
        System.out.println("Compare with .equalIgnorCase()" + s.equalsIgnoreCase("Pen"));

        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){

        }

        int len = s.length();
        System.out.println(len);

        if (s.length() > 4){
            System.out.println("long word");
        }else {
            System.out.println("Short word");
        }

        System.out.println(("aaaa").length());
        System.out.println(("aa aa").length());

    }

}
