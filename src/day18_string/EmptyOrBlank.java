package day18_string;

public class EmptyOrBlank {

    public static void main(String[] args) {

        String str = "last exampe";
        System.out.println(str.isEmpty());// false

        str = ""; // empty, no characters at all
        System.out.println(str.isEmpty()); // true

        String s = " ";// space as a character so not empty
        System.out.println("S is empty : "+s.isEmpty()); // false because there is a space character

    //    if (s.length() == 0 ){ // 0 ( will show false) means that no characters if we will put 1 it's mean true
     //       System.out.println("empty");
      //  }else{
     //       System.out.println("character");
       // }

        System.out.println("s is empty "+s.isBlank());

        String s2 = "      ";
        System.out.println(s2.isEmpty());


    }

}
