package day09_Scanner;

public class GoForWalk {
    public static void main(String[] args) {

        // We want to go for a walk
        // We will go for a walk if it is not raining and the weather is above 70
        // There is no need to check the weather if it is raning
        boolean isRaining = false;
        int temperature = 80;
        System.out.println("Go to walk " + (!isRaining && temperature > 70)); //!isRaining -> (NOT)!false -> true

    }
}
