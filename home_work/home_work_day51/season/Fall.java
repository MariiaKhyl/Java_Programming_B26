package home_work_day51.season;

public class Fall extends Season{

    public Fall(double highestTemp, double lowestTemp){
        super("Fall", highestTemp,lowestTemp);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");;
    }
}
