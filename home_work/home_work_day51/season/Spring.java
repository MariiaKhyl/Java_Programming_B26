package home_work_day51.season;

public class Spring extends Season {

    public Spring(double highestTemp, double lowestTemp){
        super("Spring",highestTemp,lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");;
    }
}
