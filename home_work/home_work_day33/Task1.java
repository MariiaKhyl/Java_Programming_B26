package home_work_day33;

public class Task1 {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space
create a method that can print even numbers between 1-100 in the
same line saperated by space
     */
    public static void evenNumbers(int numbers){

        for (int i = 0; i <= numbers; i++) {

            if (i%2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void oddNumbers(int numbers){

        for (int i = 0; i <=numbers; i++){

            if (i % 2 == 1){
                System.out.print(i+" ");
            }


        }
    }

    public static void main(String[] args) {
        evenNumbers(100);
        oddNumbers(100);
    }




}
