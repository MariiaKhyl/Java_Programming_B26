package home_work_day55;

public abstract class Book {

    String name;

    public abstract void read();

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
