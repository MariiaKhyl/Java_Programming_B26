package replit;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

public class FirstAndLastCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};



        for (String each : words){

            each = each.substring(0,1)+each.charAt(each.length()-1);
            System.out.println(each);
        }











    }
}
