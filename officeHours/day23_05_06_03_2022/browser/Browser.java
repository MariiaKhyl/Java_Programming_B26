package day23_05_06_03_2022.browser;

public class Browser {

    /*
    public String version;
    public Browser(String version) {
        this.version = version;
    }
     */

    public void open(){
        System.out.println("Opening browser");
    }
    public void close(){
        System.out.println("Closing browser");
    }

    // final methods can not be overriden.
    // Since we have all this features in any browser
    // I wil not implement them again
    public final void navigate(String url) {

        System.out.println("Type " + url);
        System.out.println("Press ENTER ");

    }

    public final void refresh() {
        System.out.println("Refreshing....");
    }

    public final void backward() {
        System.out.println("backward");
    }

    public final void forward() {
        System.out.println("forward");
    }


}
