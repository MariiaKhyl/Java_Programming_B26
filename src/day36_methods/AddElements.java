package day36_methods;

import java.util.Arrays;

public class AddElements {

    public static int [] addElement (int [] original, int elementToAdd){
        int [] newArray = new int [original.length+1];
        for (int i = 0; i < original.length; i++){

            newArray[i] = original[i];
        }
        // instead of doing a loop by ourselves, we could have used Arrays.copyOf()
        newArray[newArray.length-1]= elementToAdd;
        return newArray;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = addElement(a, 4);
        System.out.println(Arrays.toString(b));

        //task 3 ( two arrays)
        int [] y = {5,23,6,21};
        int [] z = {3,23,6};
        System.out.println(Arrays.toString(addElement(y,z)));



    }

    public static String [] addElement (String [] original , String element){

        String [] newArray = {"array","int","long","double","string"};

        for (int i = 0; i < original.length; i++) {

            newArray[i] = original[i];
        }
        newArray[newArray.length-1] = element;
        return newArray;
        //return null;
    }
    public static int [] addElement (int [] original, int [] elementsToAdd){

        int [] newArr =new int [original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArr.length; i++) {

            if(i< original.length){
                //added the element from the original array in the new array
                newArr[i] = original[i];
            }else{
                // added the new elements to the new array
                newArr[i] = elementsToAdd[j++];
            }
        }
        return newArr;
    }

}
