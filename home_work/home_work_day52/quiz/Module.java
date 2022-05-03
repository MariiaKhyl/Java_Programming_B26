package home_work_day52.quiz;

import java.util.ArrayList;

public class Module {

    ArrayList<File> files = new ArrayList<>();
    public Module(){
    }
    public Module(ArrayList<File> obj){
        this();
        this.files=obj;
    }

    public String toString(Quiz quiz){
        return quiz.toString();
    }
    public void addFile(File file){
        files.add(file);
    }
    public void removeFile(File file){
        files.remove(file);
    }


    /*
    create a class Module
instance variables:
- files (ArrayList of File objects)
constructor:
- no parameter -> create empty ArrayList object
- initialize with given ArrayList of Files
-> Use chaining
methods:
- toString: print all the quiz information
- addFile(File): accept a File object and add the given File to the ArrayList of Files of that module
Unit 5 - Problem Set
- removeFile(File): accepts a File object and remove the given File from the ArrayList of Files of that module
     */
}
