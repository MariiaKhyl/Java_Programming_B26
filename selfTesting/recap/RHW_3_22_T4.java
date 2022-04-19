package recap;

public class RHW_3_22_T4 {
    /*
    create a method that can print odd numbers between 1-100 in the same line saperated by space

    create a method that can print even numbers between 1-100 in the same line saperated by space
     */

    public static void evenNumbers(int numbers) {

        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void oddNumbers(int numbers) {
        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void evenBigger (int numbers){
        for ( int i = numbers; i>=0; i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void oddBigger (int numbers){
        for (int i = numbers; i>= 0; i--){
            if (i%2== 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        evenNumbers(100);
        evenBigger(100);
        oddNumbers(100);
        oddBigger(100);
    }


}
