package day21_loops;

public class MiddleChar {

    public static void main(String[] args) {

        String s ="abcde";

        int len = s.length();

        if(s.length()%2==0){
            //our word is even length

            char firstMiddle = s.charAt(len/2-1);
            char secondMiddle = s.charAt(len/2);
            System.out.println("Whith charAt"+firstMiddle +secondMiddle);
            System.out.println("With substring: "+ s.substring(len/2-1,len/2+1));

        }else{
            //our word is odd length

            // length / 2: 5/2== 2
            char middle = s.charAt(s.length()/2);
            System.out.println(middle);
            // 7/2=3
            System.out.println("middle = " + middle);
            System.out.println("with substring: "+s.substring(s.length()/2,s.length()/2+1));

        }








    }


}
