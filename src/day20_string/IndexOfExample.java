package day20_string;

public class IndexOfExample {

    public static void main(String[] args) {

        String word = "banana";
        //             012345
        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex);

        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex);

        int secondIndex = word.indexOf('a', firstIndex +1);
        System.out.println(secondIndex);

        int thirdIndex =word.indexOf('a', secondIndex+1);
        System.out.println(thirdIndex);

        String s = "shopping cart 131231";
        int index = s.indexOf(" ");
        String ss = s.substring(0,index);
        String sss = s.substring(index+1);
        System.out.println(sss +" "+ss);
















    }


}
