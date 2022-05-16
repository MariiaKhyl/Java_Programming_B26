package day56_polymorphism.book;

import home_work_day55.JavaTextbook;

public class Library {
    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
//        book1.name = "Java Programming";
//        book1.size = 20.5;
//        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();



    }
}
