package day13_14_03_29_2022;

import java.util.ArrayList;

public class P08_Task05 {
    /*
    Write a method that can verify if a password is a strong password. Characteristics of strong passwords are:
                       1.1 Password must be at least have 8 characters long, and should not contain space
                       1.2 PassWord should at least contain one upper case letter
                       1.3 PassWord should at least contain one lower case letter
                       1.4 Password should at least contain one special characters
                       1.5 Password should at least contain a digit
     */
    public static void main(String[] args) {
        System.out.println(passwordChecking("Ssifopu3232"));
    }

    public static String passwordChecking(String password) {

        int other = 0;
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int total = 0;

        if (password.length() >= 8 && (!password.contains(" "))) {
            for (int i = 0; i < password.length(); i++) {
                char each = password.charAt(i);

                if (Character.isUpperCase(each)) {
                    upper++;
                } else if (Character.isLowerCase(each)) {
                    lower++;
                } else if (Character.isDigit(each)) {
                    digits++;
                } else {
                    other++;
                }
            }
            total += upper + lower + digits + other;

            if (total >= 8 && upper >= 1 && lower >= 1 && digits >= 1 && other >= 1) {
                return password;
            }

        }

        return "Invalid password";
    }

}





