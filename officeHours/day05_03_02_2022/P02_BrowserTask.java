package day05_03_02_2022;

public class P02_BrowserTask {

    public static void main(String[] args) {

        String browserName ="chrome";
        String operatingSystem = "mac";
        boolean isBrowserOpen =false;

        if (!isBrowserOpen){
            //I will open browser
            switch (browserName){

                case "chrome":
                case "chrome-headless":
                case "firefox-headless":
                case "firefox":
                case "remote-chrome":
                    System.out.println("Browser is already is open with "+ browserName+" in "+operatingSystem);
                    break;
                case "ie":
                case "edge":
                    if (operatingSystem.equals("windows")) {
                        System.out.println("Browser is already is open with " + browserName + " in " + operatingSystem);

                    }else {
                        System.out.println("Your"+operatingSystem+"doesn't support "+browserName);
                    }
                    break;
                case "safary":
                    if (operatingSystem.equals("mac")){
                        System.out.println("Browser is already is open with "+ browserName+" in "+operatingSystem);
                    }else{
                        System.out.println("Your"+operatingSystem+"doesn't support "+browserName);
                    }


            }






        }else{
            System.out.println("Browser is already is open with "+ browserName+" in "+operatingSystem);


        }

    }

}
