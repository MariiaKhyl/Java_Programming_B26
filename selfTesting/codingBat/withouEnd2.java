package codingBat;

public class withouEnd2 {
    public static void main(String[] args) {
        System.out.println(withouEnd2("He"));
    }
    public static String withouEnd2(String str){

        String empty = "";
        if (str.length() <= 2){
            return empty;
        }
        return str.substring(1,str.length()-1);
    }
}
