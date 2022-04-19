package home_work_day24;

public class SpaceProgram {
    /*
    Space program [String, Loops]

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
     */
    public static void main(String[] args) {

        String word= "java language";
        String returns = "";

        for (int i=0; i<word.length();i++){


            if(word.substring(i,i+1).equals(" ")) {

                returns+="_ ";

            }else{
                returns+=word.substring(i, i+1)+" ";
            }


        }

        System.out.println(returns);











    }


}
