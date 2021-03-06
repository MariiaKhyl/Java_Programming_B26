package more_practice.week1;

public class xyzMiddle {
    /*
    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

     */

    public static boolean xyzMiddle(String str) {

        String xyz = "xyz";
        int length = str.length();
        int middle = length / 2;

        if (str.length() < 3)
            return false;

        if (str.length() % 2 != 0) {

            if (xyz.equals(str.substring(middle - 1, middle + 2))) {
                return true;

            } else {
                return false;
            }

        } else if (xyz.equals(str.substring(middle - 1, middle + 2)) ||

                xyz.equals(str.substring(middle - 2, middle + 1))) {

            return true;

        } else
            return false;
    }
}
