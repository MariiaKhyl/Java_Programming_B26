package day23_05_06_03_2022.browser;

public class BrowserObject {
    public static void main(String[] args) {

        System.out.println("======CHROME======");

        Chrome chrome = new Chrome();
        chrome.open();
        chrome.navigate("www.google.com");
        chrome.refresh();
        chrome.close();

        System.out.println("======FIREFOX======");
        FireFox firefox = new FireFox();
        firefox.open();
        firefox.navigate("www.google.com");
        firefox.refresh();
        firefox.close();

        System.out.println("======OPERA======");
        Opera opera = new Opera();
        opera.open();
        opera.navigate("www.google.com");
        opera.refresh();
        opera.close();

        System.out.println("======SAFARI======");
        Safari safari = new Safari();
        safari.open();
        safari.navigate("www.google.com");
        safari.refresh();
        safari.close();
    }
}
