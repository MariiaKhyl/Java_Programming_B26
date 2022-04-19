package test;

public class task_String {
    public static void main(String[] args) {

        /*
[SMS parts]
Given a String in the following format: “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
Sender: actualSender
Number: actualNumber
Message: actualMessage”

        //String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        /*int firstBrace = message.indexOf('<');
        int secondBrace = message.indexOf('>');

        System.out.println("Sender: "+message.substring(firstBrace+1,secondBrace));

        int firstBrace1 = message.indexOf('[');
        int secondBrace1 = message.indexOf(']');
        System.out.println("Number: "+message.substring(firstBrace1+1,secondBrace1));

        int firstBrace2 = message.indexOf('{');
        int secondBrace2 = message.indexOf('}');
        System.out.println("Message: "+message.substring(firstBrace2+1,secondBrace2));



        String hello = "We {want} to (help you) with [your] coding tonight";

        int brace1 = hello.indexOf('{');
        int brace2 = hello.indexOf('}');

        int brace3 = hello.indexOf('(');
        int brace4 = hello.indexOf(')');

        int brace5 = hello.indexOf('[');
        int brace6 = hello.indexOf(']');



        System.out.println("We "+hello.substring(brace1+1, brace2)+" to "+hello.substring(brace3+1, brace4)+" with "+hello.substring(brace5+1, brace6)+" coding tonight");

*/

        String word = "I %like% to *eat* very $much$";
//                     01234567890123456789012345678
        int char1=word.indexOf('%');
        int char4 =word.indexOf("% to");
        int char2=word.indexOf("*");
        int char5=word.indexOf("* v");
        int char3=word.indexOf('$');
        //int char6 = word.indexOf("$ ");
        System.out.println("I "+word.substring(char1+1,char4)+" to "+word.substring(char2+1, char5)+" very "+word.substring(char3+1));







    }


}
