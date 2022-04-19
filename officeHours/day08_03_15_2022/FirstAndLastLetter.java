package day08_03_15_2022;

public class FirstAndLastLetter {

    public static void main(String[] args) {

        /*
        Write a program that accepts String array.Count how many names have the same first and last letter

          				Input : "Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"

          				Output :    4

          			Small Task --> 	Find  the longest word at the same time  --> Donald
         */

        String [] names = {"Anna", "Mike", "Aliya", "Donald", "Saim", "Remus", "Mehmet","Asya"};
        char first, last;
        int count = 0;
        String longest = names[0];
        String smallest = names[0];

        for (int i = 0; i < names.length;i++){

            first = names[i].toLowerCase().charAt(0);
            last = names[i].toLowerCase().charAt(names[i].length() - 1);

            if (first == last) {

                count++;
            }

        }
        System.out.println(count);

        for (String result : names){

            if (result.length () > longest.length()){

                longest = result;
            }
            if (result.length() < smallest.length()){
                smallest = result;
            }

        }
        System.out.println("Biggest String: "+ longest);
        System.out.println("Smallest String: "+smallest);



    }

}
