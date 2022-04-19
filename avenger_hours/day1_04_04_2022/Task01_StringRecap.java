package day1_04_04_2022;

public class Task01_StringRecap {
    /*
    String - object type. sequence of chars
    string class is a member of java.lang package.no need to import.
    both are same in terms of usage, but only different for memory location
    String objects are immutable wich means unmodifiable/unchangeable.


    Task 01(String):

         Write a method that accepts a String (date with time) and creates a timeStamp for your automation report

         String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900

     */

    public static void main(String[] args) {
        System.out.println(timeStamp("10/10/2022 14:59:00"));



        String date = "10/10/2022 14:59:00";
        date = date.replace("/", "");
        System.out.println("1--> "+date);

        date = date.replace(" ","");
        System.out.println("2--> "+date);

        date = date.replace(":","");
        System.out.println("3--> "+date);

        System.out.println(timeSt("10/10/2022 14:59:00"));

        timeStampWithVoid(date);


    }
    public static String timeSt (String dateFromUI){
        dateFromUI = dateFromUI.replace("/","").replace(" ", "").replace(":","");
        return dateFromUI;

    }
    public static void timeStampWithVoid (String date){
        date = date.replace("/","").replace(" ", "").replace(":","");

        System.out.println("from void method "+date);
    }


    public static String timeStamp (String str){
        String data = "";
        for (int i = 0; i < str.length()-1; i++){
            if(Character.isDigit(str.charAt(i))){
                data+=str.charAt(i);
            }
        }
        return data;
    }



}
