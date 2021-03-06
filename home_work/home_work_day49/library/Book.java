package home_work_day49.library;

public class Book {
    /*
    Create a Book class

    - create variables:
        title, author, genre, chapter, price, has a movie

        */
    String title, author, genre;
    int chapter;
    double price;
    boolean hasMovie;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapter=" + chapter +
                ", price=" + price +
                ", hasMovie=" + hasMovie +
                '}';
    }

    /*

Create a class AudioBook

    - AudioBook class inherits Book class

    - create additional variables:
        duration, narrator

    - create method:
        listen()
            Example output: prints listening to $title narrated by $narrator

Create a class EBook

    - EBook class inherits Book class

    - create additional variables:
        size, pages

    - create method:
        read()
            Example output: prints Reading a digital copy of $title

Create objects of all three to see which variables and methods each object has access to
     */
}
