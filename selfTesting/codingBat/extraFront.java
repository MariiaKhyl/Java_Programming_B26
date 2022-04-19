package codingBat;

public class extraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("H"));
    }
    public static String extraFront(String str){


        if (str.isBlank()){
            return str;

        }else if (str.length() == 1){
            return str+str+str;

        }else if (str.length() == 2){
            return str+str+str;

        }else if (str.length() > 3){
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
        return "str";
    }
}
