package codingBat;

public class Hello3 {

    public static void main(String[] args) {

       String str = "Hello";
       int count = 0;

       boolean check = false;

        for (int i = 0; i < str.length()-1; i++) {

            if (str.substring(i, i+1).equals("e")){
                check = true;
                count++;
            }

        }
       if (count >= 1 && count<=3){
           System.out.println(check);
       }else {
           System.out.println("False");
       }




    }
}
