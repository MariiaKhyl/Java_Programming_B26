package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {

        System.out.println("This was not tabbed");
        System.out.println("\tThis was tabbed one");
        System.out.println("\t\tThis was tabbed twice");
        /*
        Escape sequences are using in quotations
         */
        System.out.println("      This was tabbed twice ");

        // examples of next lines
        System.out.println();
        System.out.println("1) Go to store ");
        System.out.println("2) Grab a milk");
        System.out.println("3) wash car");

        System.out.println("\n1) Go to store\n2) Grab a milk\n3) Wash a car");

    }
}
