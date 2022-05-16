package day25_05_11_12_2022.browserTask;

public class ChromeDriver extends RemoteDriver{

    @Override
    public void executeScript(String script) {
        System.out.println("Script");
    }

    @Override
    public void takeScreenShot(String name) {
        System.out.println("Take a screen shot");
    }

    @Override
    public void get(String URL) {
        System.out.println("URL");
    }

    @Override
    public void close() {
        System.out.println("Close");
    }

    @Override
    public void quit() {
        System.out.println("Quit");
    }
}
