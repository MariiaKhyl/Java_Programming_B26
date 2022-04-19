package day03_02_22_2022;

import java.util.Scanner;

public class BrowserTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter browser name");
        String browserName = input.nextLine();
        System.out.println("Please enter operation system name");
        String operatingSystem = input.nextLine();
        System.out.println("Is it open?");
        boolean isBrowserOpened = input.nextBoolean();

        switch (browserName) {

            case "chrome":

                if (isBrowserOpened == false) {
                    System.out.println("Browser is opened successfully with chrome in " + operatingSystem);
                } else if (isBrowserOpened == true) {
                    System.out.println("Browser is already opened with chrome in " + operatingSystem);
                }
                break;


            case "chrome-headless":

                if (isBrowserOpened == false) {
                    System.out.println("Browser is opened successfully with chrome-headless in " + operatingSystem);
                } else if (isBrowserOpened == true) {
                    System.out.println("Browser is already opened with chrome-headless in " + operatingSystem);
                }
                break;

            case "firefox-headless":

                if (isBrowserOpened == false) {
                    System.out.println("Browser is opened successfully with firefox-headless in " + operatingSystem);
                } else if (isBrowserOpened == true) {
                    System.out.println("Browser is already opened with firefox-headless in " + operatingSystem);
                }
                break;

            case "firefox":

                if (isBrowserOpened == false) {
                    System.out.println("Browser is opened successfully with firefox in " + operatingSystem);
                } else if (isBrowserOpened == true) {
                    System.out.println("Browser is already opened with firefox in " + operatingSystem);
                }
                break;

            case "ie":

                if (operatingSystem == "windows") {

                    if (isBrowserOpened == false) {
                        System.out.println("Browser is opened successfully with ie in " + operatingSystem);
                    } else if (isBrowserOpened == true) {
                        System.out.println("Browser is already opened with ie in " + operatingSystem);
                    }
                } else {
                    System.out.println("Your mac doesn't support ie");
                }

                break;

            case "edge":

                if (operatingSystem == "windows") {

                    if (isBrowserOpened == false) {
                        System.out.println("Browser is opened successfully with edge in " + operatingSystem);
                    } else if (isBrowserOpened == true) {
                        System.out.println("Browser is already opened with edge in " + operatingSystem);
                    }
                } else {
                    System.out.println("Your mac doesn't support edge");
                }
                break;

            case "safari":

                if (operatingSystem == "mac") {

                    if (isBrowserOpened == false) {
                        System.out.println("Browser is opened successfully with safari in " + operatingSystem);
                    } else if (isBrowserOpened == true) {
                        System.out.println("Browser is already opened with safari in " + operatingSystem);
                    }
                } else {
                    System.out.println("Your windows doesn't support safari");
                }
                break;

            case "remote-chrome":

                if (isBrowserOpened == false) {
                    System.out.println("Browser is opened successfully with remote-chrome in " + operatingSystem);
                } else if (isBrowserOpened == true) {
                    System.out.println("Browser is already opened with remote-chrome in " + operatingSystem);
                }
                break;

            default:
                System.out.println("Invalid entry");

        }

        System.out.println(operatingSystem + " "+ browserName);


    }

}
