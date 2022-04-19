package recap;

public class SumOfDigitsRecap {

    public static void main(String[] args) {

        /*
        SumOfDigits

        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3
         */
        //HardCODED


        //      012345
        // manually = Hardcoded = IT will run and dive correct output only for this data

        // str.charAt(1); -> returns us char data
        // System.out.println(str.charAt(1)-48+str.charAt(3)-48+str.charAt(5)-48); // we will get number

        //Dynamic -- it will run for all kind of data

        // first check each char

        String hello = "A1B2C3D4M2B9O3";
        int number = 0;

        for (int i = 0; i < hello.length(); i++) {

            char sum = hello.charAt(i);

            if (sum>='0' && sum <='9'){

                number+=sum-48;

            }


        }

        System.out.println("Sum is "+number);



    }

}
