package test;

public class HomeWorkTwo {
    /*
    12. Write a Java program to check whether a given string ends with the contents of another string. Go to the editor

Sample Output:

"Python Exercises" ends with "se"? false
"Python Exercise" ends with "se"? true
     */
    public static void main(String[] args) {

        String str = "Python Exercises";

        System.out.println(endsWithSe(str));
    }
    public static boolean endsWithSe (String str){

        if (str.endsWith("se")){
            return true;
        }else{
            return false;
        }

    }

}
