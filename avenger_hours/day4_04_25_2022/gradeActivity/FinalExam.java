package day4_04_25_2022.gradeActivity;

public class FinalExam extends GradeActivity{

    int numQuestion, numMissed;
    double pointEach;

    public FinalExam(int numQuestion, int numMissed){
        this.numQuestion=numQuestion;
        this.numMissed=numMissed;
        calcNumericScore();
    }

    public void calcNumericScore(){
        pointEach=100.00/numQuestion;
        double numericScore = 100.0 - (numMissed*pointEach);
        setScore(numericScore);

    }


    /*
     - Create a class FinalExam (subclass of GradeActivity)
                     - Instance variables: -int numQuestion (total question number in the exam)
                                       -double pointsEach  (points per each question)
                                       -int numMissed   (number of wrong answers)

                     - Constructor; parameters -> numQuestions, numMissed
                        assign these parameters

                     - Instance method ; calcNumericScore()
                         first calculate the pointsEach  (based on 100 pts)
                         then declare a numericScore variable and calculate => formula;  (100-(numMissed*pointsEach))
                         then call setScore() method with numericScore variable
     */
}
