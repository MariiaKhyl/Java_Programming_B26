package day33_methods;

public class GetCharacters {

        /*
        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 - 9

     */
//  make a method that prints all the letters from A - Z
public static void printAtoZUpper(){
    for (char i = 'A'; i <='Z'; i++){
        System.out.print(i+" ");
    }
    System.out.println();
}
// make a method that prints all the letters from Z - A
    public static void printZtoAUpper(){
    for (char i ='Z'; i>= 'A';i--){
        System.out.print(i+" ");
    }
        System.out.println();
    }

// make a method that prints all the letters from a - z
    public static void printAtoZLower(){
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
//  make a method that prints all the letters from z - a
public static void printZtoALower(){
    for (char i ='z'; i>='a';i--){
        System.out.print(i+" ");
    }
    System.out.println();
}

//  make a method that prints all the numbers from 0 - 9
    public static void printNumbers() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }





}
