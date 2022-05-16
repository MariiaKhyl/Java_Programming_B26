package day57_exceptions.webelement;

public class Google {
    public static void main(String[] args) {

        WebElement link = new Link(); // we created a Link object with WebElement reference

        WebElement input = new Input(); // created an Input object with WebElement reference

        WebDriverUtil.clickElement(link);
        WebDriverUtil.clickElement(input);

        WebDriverUtil.clickElement(new Link());
        WebDriverUtil.clickElement(new Input());

        /*
        String [] - array that stores String objects
        Link [] - array that stores Link objects

         */

        WebElement [] allElements = new WebElement[4]; // an array that will store objects from classes that implement the WebElement interface
        // size - [null,null,null,null]

        allElements[0] = link; // size - [LINK obj,null,null,null]
        allElements[1] = input; // size - [LINK obj, INPUT obj,null,null]
        allElements[2] = new Input(); // size - [LINK obj, INPUT obj,INPUT obj,null]
        allElements[3] = new Image(); // size - [LINK obj, INPUT obj,INPUT obj,IMAGE obj]

    }

}
