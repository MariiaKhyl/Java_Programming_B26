package more_practice.week1;

public class Task05_02 {
    public static void divisibleBy(int[] arr, int number) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % number == 0) {
                result += " " + arr[i];
            }
        }
        System.out.println( "Divisible By " + number + ", result -" + result);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100};
        divisibleBy( arr, 5 );
    }

}
