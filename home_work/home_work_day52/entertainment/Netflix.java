package home_work_day52.entertainment;

public class Netflix extends Streaming{

    String showName;
    int episodeNumber, seasonNumber;

    public Netflix (String name, String company, double duration, String showName, int episodeNumber, int seasonNumber){
        super("Netflix", company,duration);
        this.showName=showName;
        this.episodeNumber=episodeNumber;
        this.seasonNumber=seasonNumber;
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", showName='" + showName + '\'' +
                ", episodeNumber=" + episodeNumber +
                ", seasonNumber=" + seasonNumber +
                ", duration=" + duration +
                '}';
    }
/*
    create a class Netflix
-> Netflix is a child of Streaming
instance variables:
- show name (String)
- episode number (int)
- season number (int)
constructor:
- initialize name, company, duration, show name, episode number, and season number
-> call super constructor
     */
}
