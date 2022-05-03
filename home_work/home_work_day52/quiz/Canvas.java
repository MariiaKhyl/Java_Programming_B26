package home_work_day52.quiz;

import java.util.ArrayList;

public class Canvas {

    String topic;
    ArrayList<Quiz> quizzes = new ArrayList<>();
    ArrayList<Module> modules = new ArrayList<>();

    public Canvas(String topic){
        this.topic=topic;
        this.quizzes=new ArrayList<>();
        this.modules=new ArrayList<>();
    }
    public Canvas (String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules){
        this(topic);
        this.quizzes.addAll(quizzes);
        this.modules.addAll(modules);
    }

    /*
    create a class Canvas
instance variables:
- topic (String)
- quizzes (ArrayList of Quiz objects)
- modules (ArrayList of Module objects)
constructor:
- initialize topic
-> create empty ArrayList objects for quizzes and modules
- overload to accept the ArrayList of Quizzes and ArrayList of Module
+ chain the constructors
     */
}
