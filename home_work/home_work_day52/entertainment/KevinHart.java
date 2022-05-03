package home_work_day52.entertainment;

public class KevinHart extends LiveShow{

    String performer, date;

    public KevinHart(String name, String company, String location, String performer, String date){
        super(name,company,location);
        this.performer=performer;
        this.date=date;
    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", performer='" + performer + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
/*
    create a class KevinHart
-> KevinHart is a child of LiveShow
instance variables:
- performer (String)
- date (String format Ex: mm/dd/yyyy)
constructor:
- initialize name, company and location, performer, date
-> call super constructor
-> hint: name value will be 'Live Show' for all subclasses
create an object of KevinHart to use the constructors, read the value of each variable to check if everything is working as expected
List the is a relation of all the classes
     */
}
