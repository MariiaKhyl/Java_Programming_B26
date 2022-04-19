package home_work_day28;

public class EvenAndOddFromArray2 {

    public static void main(String[] args) {

        int [] numbers = {4,1,3,12,5};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even "+even+"\nOdd "+odd);


    }

}
