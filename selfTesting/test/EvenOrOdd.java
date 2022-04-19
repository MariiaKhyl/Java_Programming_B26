package test;

public class EvenOrOdd {
    public static void main(String[] args) {


        int number = 0;
        String even = "";
        String odd = "";

        while (number <= 20) {
            if (number % 2 == 0) {
                even += number+" ";
            }
                number+=2;

        }

        int b = 1;
        while (b <= 20) {
            if (b % 2 == 1) {
            odd += b+" ";
                b+=2;
            }
        }
        System.out.println(even.trim());
        System.out.println(odd.trim());

    }

}