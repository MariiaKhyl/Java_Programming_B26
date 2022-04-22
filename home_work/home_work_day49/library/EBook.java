package home_work_day49.library;

import home_work_day49.library.Book;

public class EBook extends Book {
    /*
    Create a class EBook

    - EBook class inherits Book class

    - create additional variables:
        size, pages

    - create method:
        read()
            Example output: prints Reading a digital copy of $title

Create objects of all three to see which variables and methods each object has access to
     */
    String size;
    double pages;

    public void read(){
        System.out.println("Riding a digital copy of "+title);
    }



}
