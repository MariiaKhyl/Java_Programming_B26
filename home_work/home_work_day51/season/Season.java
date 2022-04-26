package home_work_day51.season;

public class Season {

    String name;
    double highestTemp, lowestTemp;

    public Season(String name, double highestTemp, double lowestTemp){
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }
     public void activity(){
         System.out.println("Activities");
     }

    @Override
    public String toString() {
        return "Season:\n" +
                "name: " + name +
                ", highestTemp: " + highestTemp +
                ", lowestTemp: " + lowestTemp;
    }

}
