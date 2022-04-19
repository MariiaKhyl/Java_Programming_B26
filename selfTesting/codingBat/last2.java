package codingBat;

public class last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxxhi"));
    }
    public static int last2 (String str){
        String result = "";
        int count =0;
        if(str.length()<2){
            return 0;
        }
        result =str.substring(str.length()-2);

        for (int i = 0; i < str.length()-2; i++) {
            String sub = str.substring(i,i+2);
            if(sub.equals(result)){
                count++;
            }
        }
            return count;


    }
}
