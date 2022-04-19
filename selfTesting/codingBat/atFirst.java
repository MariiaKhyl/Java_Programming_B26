package codingBat;

public class atFirst {
    public static void main(String[] args) {
        System.out.println(atFirst(""));
    }
    public static String atFirst(String str){

        if (str.length() == 1){
            return str+"@";
        }else if (str.length() == 2){
            return str;
        }else if (str.isEmpty()){
         return "@@";
        }else{
            return str.substring(0,2);
        }

    }
}
