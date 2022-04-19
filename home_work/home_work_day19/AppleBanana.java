package home_work_day19;

public class AppleBanana {

    public static void main(String[] args) {

        /*
        [Remove first and last]
Given two words. Print the first word without its first character then print the second word without its last character.
Input:
apple banana
Output:
pple
banan
         */

        String apple = "apple";
        //              01234
        String banana = "banana";
        //               012345
        System.out.println(apple.substring(1));
        System.out.println(banana.substring(0, 5));

        String plants = "plants";
        //               012345
        String chair = "chairs";
        //              012345
        System.out.println(plants.substring(0, 5));
        System.out.println(chair.substring(0, 5));

        String watermelon = "watermelon";
        //                   0123456789
        String telephone = "telephone";
        //                  012345678
        System.out.println(watermelon.substring(0,5)+" "+watermelon.substring(5, 10));
        System.out.println(telephone.substring(0, 4)+" "+telephone.substring(4, 9));
        System.out.println(telephone.substring(0, 4)+watermelon.substring(5, 10));
        System.out.println(watermelon.substring(0,5)+telephone.substring(4, 9));

        String word = "I love my flowers";
        //             01234567890123456
        String flowers = "I have colorful rainbow";
        //                01234567890123456789012
        System.out.println(word.substring(0, 10)+flowers.substring(16, 23));
        System.out.println(flowers.substring(0,16)+word.substring(10, 17));

        System.out.println(word.substring(0, 10)+watermelon.substring(5,10));

    }
}
