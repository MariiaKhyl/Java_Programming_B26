package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String s = "App";
        System.out.println(str.startsWith(s)); // does the String str start with the String s?

        System.out.println(str.startsWith(" App"));

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a"));

        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("good"));
        System.out.println(sentence.endsWith("today was a good day"));



    }
}
