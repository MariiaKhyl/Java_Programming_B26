package day31_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = new String[5][];
        //String [][] cydeo = new String [4][3];
        //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]] --> 4 inner arrays that each have a size of 3
        System.out.println(Arrays.deepToString(cydeo));

        String[] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

        String [] groupTwo = {"Maria","Victoria", "Max","Lisa"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupThree = {"Jannie", "Brad","Anna", "Bob", "Joe"};
        cydeo [2] = groupThree;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 4");
        cydeo[3] = new String []{"Mustafa","Lima"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Same group 3 as group 4");
        cydeo[4] = cydeo[3];
        System.out.println(Arrays.deepToString(cydeo));


        for (String[] innerArray : cydeo) { // loops through the 2D array, cydeo
            for (String eachWord : innerArray) { // loops through every String element in each 1D inner array
                System.out.println(eachWord);
            }
        }





    }
}
