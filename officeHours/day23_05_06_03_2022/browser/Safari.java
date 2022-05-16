package day23_05_06_03_2022.browser;

public class Safari extends Browser{

    @Override
    public void open() {
        System.out.println("Opening Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari browser");
    }
}
