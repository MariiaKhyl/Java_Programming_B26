package home_work_day51.season;

public class CheckSeason {
    public static void main(String[] args) {

        Winter winter = new Winter(5.1,-30.3);
        winter.activity();
        System.out.println(winter);

        Summer summer = new Summer(35,20);
        summer.activity();
        System.out.println(summer);

        Fall fall = new Fall(25,0);
        fall.activity();
        System.out.println(fall);

        Spring spring = new Spring(25,0);
        spring.activity();
        System.out.println(spring);

    }
}
