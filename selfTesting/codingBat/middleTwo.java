package codingBat;

public class middleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("codee"));
    }

    public static String middleTwo(String str) {

        if (str.length() <= 2){
            return str;
        }
        if (str.length() % 2 == 0){
            return str.substring(str.length()/2-1, str.length()/2+1);
        }
        if (str.length() % 2 ==1){

        }
        return str.substring(str.length()/2, str.length()/2+1);
    }
}
