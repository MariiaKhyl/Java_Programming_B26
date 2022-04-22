package home_work_day50.app;

public class UsingApp {
    public static void main(String[] args) {

        App app1 = new App("Game", 2.2);
        app1.download();
        System.out.println(app1);

        Instagram app2 = new Instagram(3.3);
        app2.name = "John";
        app2.version = 22;
        app2.download();
        app2.postPicture();
        System.out.println(app2);

        YouTube app3 = new YouTube (1.2);
        app3.download();
        app3.watchVideo();
        System.out.println(app3);


    }
}
