package home_work_day57;

public class Input1 implements WebElement1{
    /*
    create a class Input
    implement the WebElement interface and implement all abstract methods
     */

    public void click(){
        System.out.println("Click input");
    }
    public String getText(){
        return "Getting input text";
    }
    public boolean sendKeys(String text){
        System.out.println(text);
        System.out.println(text+" getting text");
        return false;
    }




}
