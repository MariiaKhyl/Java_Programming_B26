package day06_03_08_2022;

public class SumOfDigits {
    public static void main(String[] args) {

        /*
        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = scanner.nextLine();
        int attemts = 0;

        for (int i = 0; i <= word.length(); i++) {

            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {

                switch (word) {

                    case "0":
                        attemts += 0;
                        break;
                    case "1":
                        attemts += 1;
                        break;
                    case "2":
                        attemts += 2;
                        break;
                    case "3":
                        attemts += 3;
                        break;
                    case "4":
                        attemts += 4;
                        break;
                    case "5":
                        attemts += 5;
                        break;
                    case "6":
                        attemts += 6;
                        break;
                    case "7":
                        attemts += 7;
                        break;
                    case "8":
                        attemts += 8;
                        break;
                    case "9":
                        attemts += 9;
                        break;
                    default:
                        System.out.println("Invalid");

                }


                System.out.println(attemts);

            }


        }

         */

        String wordM = "Cydeo School";
        String result = wordM.charAt(0)+" "+wordM.charAt(1)+" "+wordM.charAt(2)+" "+wordM.charAt(3)+" "+wordM.charAt(4);
        System.out.println(result);

        for (int i=0; i<wordM.length();i++){

            System.out.print(wordM.charAt(i)+" ");

        }






    }
}
