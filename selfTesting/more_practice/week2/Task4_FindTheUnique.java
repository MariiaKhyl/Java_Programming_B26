package more_practice.week2;

public class Task4_FindTheUnique {
    /*
    4) String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }

    public static String uniqueChar (String str){

        String unique = "";
        int count = 0;

        for(int i = 0; i < str.length(); i++){

            char current = str.charAt(i);
            if (unique.indexOf(current) < 0){
                unique+=current;
            }else{
                unique = unique.replace(String.valueOf(current),"");
            }

        }
        return unique;
    }

}
