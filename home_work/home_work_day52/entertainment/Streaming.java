package home_work_day52.entertainment;

public class Streaming extends Entertainment{

    double duration;

    public Streaming (String name, String company, double duration){
        super("Streaming",company);
        this.duration=duration;
    }

    @Override
    public String toString() {
        return "Streaming{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", duration=" + duration +
                '}';
    }

    /*
    create a class Streaming
-> Streaming is a child of Entertainment
instance variables:
- duration (double)
constructor:
- initialize name, company, and duration
-> call super constructor
-> hint: name value will be 'Streaming' for all subclasses
     */
}
