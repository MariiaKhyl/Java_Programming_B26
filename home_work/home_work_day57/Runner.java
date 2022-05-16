package home_work_day57;

public class Runner {
    // create a runner class to create objects of Link and Input with a focus on the interface references
    public static void main(String[] args) {

        Link1 link = new Link1();
        link.click();
        link.getText();
        link.sendKeys("Hello");
        System.out.println(link.sendKeys("Hola"));

        Input1 input = new Input1();
        input.click();
        input.getText();
        input.sendKeys("Keys");



    }
}
