package day31_arrays;

public class AwsZone {
    public static void main(String[] args) {

        /*
        AWS Zones

    Given an app name and a String of zones in the following format

	us-east-1,us-west-1,us-west-2,us-west-3

	print the app deploying to each zone

    Ex:
	app = etsy
    zones = us-east-1,us-west-2,us-west-1

    output:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		Deploying etsy to us-west-2...
		Deployment completed for us-west-2
         */

        String app = "etsy";
        String zones = "us-east1,us-west1,us-wesr2,us-west3";

        String [] allZone = zones.split(",");
        for (String eachZone : allZone){

            System.out.println(app+" is deploying on "+eachZone);

        }
/*
        for (int i = 0; i < allZone.length; i++) {
            System.out.println(app+" is deploying on "+ allZone[i]);
        }

 */








    }
}
