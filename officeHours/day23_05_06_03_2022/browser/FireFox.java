package day23_05_06_03_2022.browser;

public class FireFox extends Browser{

    @Override
    public void open() {
        System.out.println("Opening FireFox browser");
    }

    public void close(){
        System.out.println("Closing FireFox browser");
    }

}
