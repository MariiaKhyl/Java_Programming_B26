package day19_string;

public class IndexOfMethod {

    public static void main(String[] args) {

        String s = "pen";

        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));

        System.out.println(s.indexOf("x"));


        System.out.println(s.indexOf("pe"));
        System.out.println(s.indexOf("pz"));


        String word = "apple";
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("p"));
        System.out.println(word.indexOf("p"));
        System.out.println(word.indexOf("l"));
        System.out.println(word.indexOf("e"));
        System.out.println(word.indexOf("r"));

    }
}
