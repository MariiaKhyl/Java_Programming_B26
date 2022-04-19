package recap;

public class RHW_3_22_T8 {
    /*
    create a method that accepts a String and print each character of the String on a seperate line
     */

    public static void nameMethod (String word){

        for (int i = 0; i < word.length(); i++){

            System.out.println(word.charAt(i)+" ");
        }


    }

    public static void main(String[] args) {
        nameMethod("Mariia");
        nameMethod("I don't know if I will make it");
    }


}
