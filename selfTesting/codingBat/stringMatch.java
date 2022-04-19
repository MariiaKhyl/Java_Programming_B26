package codingBat;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz","xxbaaz" ));
    }

    public static int stringMatch (String a, String b){

        int count = 0;
        int length = Math.min(a.length(), b.length());

        for (int i = 0; i < length-1; i++) {
            String aCheck = a.substring(i,i+2);
            String bCheck = b.substring(i,i+2);

            if (aCheck.equals(bCheck)){
                count++;
            }
        }
        return count;

    }
}
