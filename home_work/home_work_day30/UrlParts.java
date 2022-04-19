package home_work_day30;

import java.util.Arrays;

public class UrlParts {
    public static void main(String[] args) {

        /*
        URL Parts

    Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130
         */

        String url = "https://learn.cydeo.com/courses/130";

        String [] arr = url.split("/");

        for (String each : arr){
            System.out.println(each);
        }















    }
}
