package test;

public class Method3 {
    public static void main(String[] args) {
        /*
        3. Write a Java method to display the middle character of a string. Go to the editor
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:
         */

        System.out.println(middleChar("String"));
    }
    public static String middleChar(String str){

        if (str.length()%2 == 0){
            return str.substring(str.length()/2-1,str.length()/2+1);
        }else if(str.length()%2 == 1){
            return str.substring(str.length()/2, str.length()/2+1);
        }
return str;
    }

}
