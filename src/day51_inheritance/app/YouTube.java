package day51_inheritance.app;

public class YouTube extends App {

    public YouTube(double version) {
        super("Youtube", version);
    }

    public void download() {
        System.out.println(name + " is downloading version 1.4");
    }

    public void watchVideo() {
        System.out.println(name+" watching java tutorial");
    }


}
