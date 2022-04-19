package day03_comments_escape_sequence;

public class Quotes {

    public static void main(String[] args) {

        System.out.println("I like \"JAVA\" programming");
        System.out.println("we \nwill\ndo\nhomework");
        System.out.print("do\nwe\nneed\n\t\"JAVA\"");
        System.out.println("\n\"This is a quote\"");

        /*
        The first quote is before java printing the text
        The second quote is to print the " quotation mark in the console
         */
        System.out.println("abc\\def");

        /*
        The first backslash is for the syntax of escape characters
        The second backslash is for the backslash character to be output
         */
        System.out.println("abc\\\\def"); // this will print two backslash
        System.out.println("abc\\def");



    }
}
