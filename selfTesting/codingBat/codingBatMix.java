package codingBat;

public class codingBatMix {
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public static void main(String[] args) {
    String str = "pix snacks";
    System.out.println(mixTrue(str));
}

    public static boolean mixTrue(String str){

        if(str.startsWith("ix",1)){
            return true;
        }else{
            return false;
        }


    }
}
