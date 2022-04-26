package home_work_day51.season;

public class Winter extends Season {

    public Winter(double highestTemp, double lowestTemp){
        super("Winter",highestTemp,lowestTemp);
    }
    @Override
    public void activity() {
        System.out.println("Use fireplace");;
    }

}
