package day4_04_25_2022.gradeActivity;

public class GradeActivity {


    private double score;

    public double getScore(){
        return score;
    }
    public void setScore(double score){
        this.score=score;
    }
    public char getGrade(){
        if (score>=90){
            return 'A';
        }else if (score >= 80){
            return 'B';
        }else if (score >= 70){
            return 'C';
        }else if (score >=60){
            return 'D';
        }else{
            return 'F';
        }
    }


    /*
    Task 01 ; - Create a class GradeActivity (implement Encapsulation process)
                    - instance variable "double score";
                    - getter and setter methods
                    - getGrade() instance method; (returns the grade based on the score value as below)
                        100>=score>=90 -> return A
                        90>score>=80 -> return B
                        80>score>=70 -> return C
                        70>score>=60 -> return D
                        score<60     -> return F

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

              - Create StudentsGrade runner class
                      -ask user how many question in the exam (Scanner)
                      -ask user how many question is missed (Scanner)
                      -give user the final grade

     */
}
