package home_work_day29;

import java.util.Scanner;

public class Countries {

    public static void main(String[] args) {

        /*
        Given a String array of countries:
            String[] countries = {
        "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
                - Find and print all the first and last characters of each country
                - Find and print all the countries that end with the letter ‘a’
                - Create “contains logic” to check if there is a certain country in the array. Can check for the United States, or use Scanner to check any country


         */

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};

        String list = "";
        char firstChar;
        char lastChar ;

        for (String each : countries){

            firstChar = each.charAt(0);
            lastChar = each.charAt(each.length()-1);

            System.out.println("First character of all countries - "+firstChar+"\nLast character of all countries - "+lastChar);
        }

        for (String each : countries){
            lastChar = each.charAt(each.length()-1);

            if (lastChar == 'a'){
                System.out.println(each);
            }
            list+=each;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country");
        String customerCountry = scanner.nextLine();
        System.out.println("Does the array contains the country name:"+list.toUpperCase().contains(customerCountry));











    }
}
