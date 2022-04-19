package recap;

public class FractionalRecap {
    public static void main(String[] args) {

        // 5 * 4 * 3 * 2 * 1
        // repeated action: multiply the numbers by one less than it
        // stopping point: number gets to 1

        int n = 5;
        int result = 1;

        while (n>1){
            System.out.println(result+" * "+n);
            result*=n;
            n--;

        }

        System.out.println(result);



    }
}
