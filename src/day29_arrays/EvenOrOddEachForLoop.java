package day29_arrays;

public class EvenOrOddEachForLoop {

    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5, 20, 13};
        int even = 0;
        int odd = 0;
        String evenNumbers = "";
        String oddNumbers = "";

      /*  for (int i = 0; i < nums.length; i++){
            if (nums[i]%2==0){
                even++;
                evenNumbers+=nums[i]+" ";
            }else{
                odd++;
                oddNumbers+=nums[i]+" ";
            }
        }

       */

        for(int number : nums){

            if(number % 2 == 0){
                even++;
                evenNumbers+=number+" ";
            }else{
                odd++;
                oddNumbers+=number+" ";
            }
        }


        System.out.println("Even counter "+even);
        System.out.println("Even numbers "+evenNumbers);

        System.out.println("Odd counter "+odd);
        System.out.println("Odd numbers "+oddNumbers);
    }
}
