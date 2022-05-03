package home_work_day52.quiz;

import java.util.ArrayList;

public class UsingCanvas {
    public static void main(String[] args) {

        /*
        create an object of the Canvas and verify all the fields and methods can be accessed and used
         */
        Canvas canvas = new Canvas("Java");

        Module module = new Module();
        File file = new File("Practice", 4.3);
        Quiz quiz = new Quiz("Practice",30,50);

        module.addFile(file);

        System.out.println(module.files);
        file.openFile();
        System.out.println(quiz);
        quiz.takeQuiz();
        ArrayList<Quiz> quiz1 = new ArrayList<>();
        quiz1.add(quiz);
        System.out.println(module.files);
    }
}
