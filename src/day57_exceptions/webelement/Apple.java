package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {

    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for(WebElement each : elements){
            System.out.println(each.getText());

            if(each instanceof Form){ // are you an object of Form
                ((Form)each).submit();
            }

        }

        WebElement logo = new Image();
        logo.click();// click method is accessible by the WebElement interface reference, then execution happens on object side

        //logo.extension = ".png"; WebElement interface does not have accessibility to the variable

        ((Image)logo).extension = ".png"; // ((Image)logo) - cast the logo (WebElement reference) to a Image reference, then the Imago reference as access to the extension variable
        System.out.println(((Image) logo).extension);

        // Option #2
        Image logoAsImage =  ((Image)logo);
        logoAsImage.extension = ".txt";
        System.out.println(logoAsImage.extension);




    }

}
