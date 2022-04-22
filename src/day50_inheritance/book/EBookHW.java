package day50_inheritance.book;

import day50_inheritance.book.BookHW;

public class EBookHW extends BookHW {

    double size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of "+title);
    }


    /*
    Create a class EBook

    - EBook class inherits Book class

    - create additional variables:
        size, pages

    - create method:
        read()
            Example output: prints Reading a digital copy of $title
     */


}
