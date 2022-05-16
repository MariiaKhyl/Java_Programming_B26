package home_work_day57;

public class Link1 implements WebElement1 {
    /*
    create a class Link
    implement the WebElement interface and implement all abstract methods
     */

    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public String getText() {
        return "getting text";
    }

    @Override
    public boolean sendKeys(String text) {
        System.out.println(text);
        System.out.println("send keys");
        return false;
    }
}
