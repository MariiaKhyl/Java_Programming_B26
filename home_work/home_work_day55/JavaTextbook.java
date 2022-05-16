package home_work_day55;

public class JavaTextbook extends EBook{

    boolean fun;

    @Override
    public void read() {
        System.out.println("We are reading");
    }

    @Override
    public void download() {
        System.out.println("We download book");
    }

    @Override
    public void open() {
        System.out.println("We trying to open downloaded book");
    }
    public String toString(){
        return super.toString()+"\nFun "+fun;
    }

}
