package day18_string;

public class RemoveSpace {


    public static void main(String[] args) {

        String s = "       Saturday       ";
        System.out.println(s);
        System.out.println(s.length());// int , 15 characters

        s = s.trim(); // removing spaces from beginning and from the end

        System.out.println(s);
        System.out.println(s.length());

        String str = "     java is fun     ";
        System.out.println(str);
        System.out.println(str.trim());

        str = str.trim();
        System.out.println(str.startsWith("java"));



    }
}
