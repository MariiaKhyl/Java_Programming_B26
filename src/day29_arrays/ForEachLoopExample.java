package day29_arrays;

public class ForEachLoopExample {
    public static void main(String[] args) {

        int [] nums = {30,12,159,12};

        for (int i = 0; i < nums.length; i++){

            System.out.println("traditional loop example "+nums[i]);
        }
        System.out.println();

        for(int element : nums){

            System.out.println("For each loop : "+element);
        }
        System.out.println();
        // String example

        String [] classes = {"Java", "soft skills", "Selenium", "database", "api"};

        // traditional
        for (int i = 0; i< classes.length; i++){

            System.out.println(classes[i]);

        }
        System.out.println();
        // for each

        for (String word : classes){

            System.out.println("For each loop "+word);
        }
        System.out.println();

        // double example

        double [] prices = {10.42, 44.5, 62.1, 10};

        for (double each : prices){

            System.out.println("$ "+each);
        }








    }

}
