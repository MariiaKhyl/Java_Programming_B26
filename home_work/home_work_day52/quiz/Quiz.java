package home_work_day52.quiz;

public class Quiz {

    String topic;
    int totalNumberOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumberOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.totalPoints = totalPoints;
    }

    public String toString() {
        return "We have a quiz - topic "+topic+" number of questions "+totalNumberOfQuestions+" total points "+totalPoints;
    }

    public void takeQuiz(){
        System.out.println("Taking the "+topic+" quiz");
    }




    /*
    [Canvas] Advance Class & Object Practice (Big Task – No Encapsulation or Inheritance)
create a class Quiz
instance variables:
- topic (String)
- total number of questions (int)
- total points (double)
constructor:
- initialize all variables
methods:
- toString: print all the quiz information
- takeQuiz(): print: Taking the $topic quiz
     */
}
