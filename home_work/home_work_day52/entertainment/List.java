package home_work_day52.entertainment;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {

        KevinHart kevinHart = new KevinHart("Kevin Hart","CNN","Los Angeles","KH","05/02/2022");
        System.out.println(kevinHart);
        System.out.println(kevinHart.company);
        System.out.println(kevinHart.name);
        System.out.println(kevinHart.location);
        System.out.println(kevinHart.date);
        System.out.println(kevinHart.performer);
        ArrayList<String> comments = new ArrayList<>(Arrays.asList("Funny cartoon.","I wanna come ne more time."));
        Youtube youTube=new Youtube("Yoytube","ABC",12.1,"Ukraine","Sternenko",800000,comments);
        System.out.println(youTube);
        Netflix netflix=new Netflix("Shinning","Fox",122.2,"Shinning",2,1);
        System.out.println(netflix);




    }
}
