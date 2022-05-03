package home_work_day52.entertainment;

public class LiveShow extends Entertainment{

    String location;

    public LiveShow(String name, String company,String location){
        super("LiveShow",company);
        this.location=location;
    }

    @Override
    public String toString() {
        return "LiveShow{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

/*
    create a class LiveShow
-> LiveShow is a child of Entertainment
instance variables:
- location (String)
constructor:
- initialize name, company, and location
-> call super constructor
-> hint: name value will be 'Live Show' for all subclasses
     */
}
