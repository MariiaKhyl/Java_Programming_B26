import java.util.Scanner;

public class FinraInRange$ {

    public static void main(String[] args) {

        /*
        similar to fizzbuzz

        number
        %3 --> fin
        %5 --> ra
        both --> finra
        neither --> number

        repeated up to some number

         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter ");
        int stop = scanner.nextInt();

        for (int i = 1; i <= stop; i++){

            String str = "";

            if(i % 3 == 0){
                str+="FIN";
            }
            if(i % 5 == 0){
                str+="RA";
            }
            System.out.println(str.isEmpty() ? i : str);

        }







    }
}
