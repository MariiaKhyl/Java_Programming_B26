package day23_loop;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        /*
        make an array of your friends names
        asking how many friends do you have
        then asked for each friend's name one at a time , store all the names into an array
        at the end print your friend list
         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("How many friends do you have?");
        int size = scanner.nextInt();
        String [] friendList = new String[size];

        for (int i = 0; i < friendList.length; i++){

            //System.out.println("Enter friend name ");
            //System.out.println("Enter name of friend "+i);
            System.out.println("Enter name of friend "+(i+1)); // i+1 it's only for message
            friendList[i] = scanner.next();

        }
        System.out.println(Arrays.toString(friendList));




    }
}
