package day36_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {
        int [] arr = {12,52,6,1,6,7,8,9};
        System.out.println(indexOf(arr,7));
        System.out.println(indexOf(arr,20));
        System.out.println(indexOf(arr, 6));

        String [] words = {"java","red","water","hello"};
        System.out.println(indexOf(words, "hello"));
    }
    public static int indexOf (String [] str, String element){
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int [] nums, int element){
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == element){
                return i;
            }
        }
        return -1;
    }

}
