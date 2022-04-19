package replit;

import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int dayByDay = 0;

        while (inhabitants >= 1){
            inhabitants/=2;
            dayByDay++;
            System.out.println("Day "+dayByDay+" ["+inhabitants+"]");
        }


    }
}
