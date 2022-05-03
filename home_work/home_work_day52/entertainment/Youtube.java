package home_work_day52.entertainment;

import java.util.ArrayList;

public class Youtube extends Streaming{

    String videoName, channelName;
    int viewCount;
    ArrayList<String> comments = new ArrayList<>();

    public Youtube(String name, String company, double duration,String videoName, String channelName, int viewCount, ArrayList<String> comments){
        super("Youtube",company,duration);
        this.videoName=videoName;
        this.channelName=channelName;
        this.viewCount=viewCount;
        this.comments=comments;
    }

    @Override
    public String toString() {
        return "Youtube{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", duration=" + duration +
                ", videoName='" + videoName + '\'' +
                ", channelName='" + channelName + '\'' +
                ", viewCount=" + viewCount +
                ", comments=" + comments +
                '}';
    }
/*
    create a class Youtube
-> Youtube is a child of Streaming
instance variables:
- video name (String)
- channel name (String)
- view count (int)
- comments (ArrayList of Strings)
Unit 5 - Problem Set
constructor:
- initialize name, company, duration, video name, channel name, view count, and comments
-> call super constructor
     */
}
