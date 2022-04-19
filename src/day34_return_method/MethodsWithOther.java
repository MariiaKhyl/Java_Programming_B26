package day34_return_method;

public class MethodsWithOther {

    public static String dayInWords(int day) {

        String str = "";

        switch (day) {

            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }

    }

    public static int firstEvenNumber (int [] nums){

        for (int num: nums){

            if (num %2 ==0){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int [] arr = { 5,1,4,12,5};
        System.out.println(firstEvenNumber(arr));

    }





    /*
    public static String dayInWords(int day) {

        String str = "";

        switch (day) {

            case 1:
                str = "Monday";
                break;
            case 2:
                str = "Tuesday";
                break;
            case 3:
                str = "Wednesday";
                break;
            case 4:
                str = "Thursday";
                break;
            case 5:
                str = "Friday";
                break;
            case 6:
                str = "Saturday";
                break;
            case 7:
                str = "Sunday";
                break;
            default:
                str="Invalid";
        }
        return str;
    }
     */

}
