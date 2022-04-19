package replit;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double sum = 0;

        for ( double each : temps){

            sum+=each;

        }
        System.out.println(sum/temps.length);

    }

}
