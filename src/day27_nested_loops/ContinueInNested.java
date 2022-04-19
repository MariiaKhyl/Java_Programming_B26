package day27_nested_loops;

public class ContinueInNested {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){ // 5 not included | i<=5- 5 included

            if(i==1 || i==2){
                continue;  // all what is going after it will skipped
            }

            System.out.println("i"+i);

            for (int j=0; j<3; j++){ // 3 not included | j<=3 included
                if(j==1){
                    continue;
                    // continue here is skipping the iteration when j is 1, so it does not get printed
                }

                System.out.println("\tj"+j);
            }

        }

    }
}
