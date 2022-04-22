package day50_inheritance.book;

import day50_inheritance.book.AudioBookHW;
import day50_inheritance.book.Author;
import day50_inheritance.book.BookHW;
import day50_inheritance.book.EBookHW;

public class LibraryHW {
    public static void main(String[] args) {

        BookHW object = new BookHW();
        // object will have access to 6 instance variables

        AudioBookHW object2 = new AudioBookHW();
        // object2 has access to the 6 variables from the Book class and the 2 new variables in the AudioBookHW class

        object2.duration = 100;
        object2. narrator = "Morgan Freeman";
        // object2 has access to the instance methods listen()

        object2.title = "Java is fun";
        object2.listen();

        EBookHW object3 = new EBookHW();
        //object3 has access to the 6 variables from the BookHW class and the 2 new variables in the EBook class:
        object3.size = 20.4;
        object3.pages = 1004;
        //object3 has access to the instance method read()
        object3.title = "Soft skills is important";
        object3.read();

        // using the updated Author info
        BookHW object4 = new BookHW();
        object4.author = new Author("JK Rowling", 40);
        System.out.println(object4.author);
        System.out.println(object4.author.getName());

        BookHW obj = new BookHW();
        obj.author = new Author("Taras Shevchenko", 55);
        System.out.println(obj.author);
        System.out.println(obj.author.getName());

    }
}
