package home_work_day55;

public abstract class EBook extends Book implements Downloadable{

    int size;

    public abstract void open();

    @Override
    public String toString() {
        return "EBook{" +
                "size=" + size +
                '}';
    }
}
