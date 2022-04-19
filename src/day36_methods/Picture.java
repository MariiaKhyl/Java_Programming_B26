package day36_methods;

public class Picture {

    public static void draw(){
        System.out.println("trying to draw");
    }
    public static void draw(String color){
        System.out.println("draw with "+color);
    }
    public static void draw(String color, String color2){
        System.out.println("drawing woth color "+color+" and with "+color2);
    }
    public static void draw(int size){
        System.out.println("drawing with size "+size);
    }
//    public static void draw (int length){ not vailid just changing the parameter name , but if you will add two int parameters then it would work
//        System.out.println("");
//    }
    public static void draw (String color, int size){
        System.out.println("color with size "+color+size);
    }
    public static void draw(int size, String color){
        System.out.println("Size and color ");
    }





}
