package home_work_day49.library;

import home_work_day49.library.AudioBook;
import home_work_day49.library.Book;
import home_work_day49.library.EBook;

public class Library {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "The Patient's Secret";
        book.author = "Loreth Anne White";
        book.genre = "Mystery";
        book.chapter = 10;
        book.price = 15.99;
        book.hasMovie = false;
        System.out.println(book);

        AudioBook book1 = new AudioBook();
        book1.title = "The Sun Also Rises";
        book1.author = "Ernest Hemingway";
        book1.genre ="Novel";
        book1.chapter = 20;
        book1.price = 20.99;
        book1.hasMovie = true;
        book1.duration = 11;
        book1.narrator = "Brittany Pressley";
        book1.listen();
        System.out.println(book1);

        System.out.println("EBook");
        EBook eBook = new EBook();
        eBook.title ="The Fifth Assassin";
        eBook.author = "Brad Meltzer";
        eBook.genre = "Mystery";
        eBook.price = 15.99;
        eBook.hasMovie = false;
        eBook.size = "5.25(w) x 8.25(h) x 1.25(d)";
        eBook.price = 436;
        eBook.read();
        System.out.println(eBook);


    }
}
