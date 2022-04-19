package day08_03_15_2022;

public class WebsiteChecker {
    public static void main(String[] args) {

        /*
        Given some urls determine how many .com, .org, and .edu websites there are.
         Also keep track of an ‘other’ category for websites that have a different domain

         Sample websites for an array:
         bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
         nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
         comcast.net, tamu.edu, utexas.edu,
         */

        String [] website = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org","nba.com","comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0;
        int org = 0;
        int edu = 0;
        int other = 0;

        for (String each : website){

            if (each.contains(".com")){
                com++;
            }else if (each.contains(".org")){
                org++;
            }else if (each.contains(".edu")){
                edu++;
            }else {
                other++;
            }


        }
        System.out.println("We have:\ncom - "+com+"\norg - "+org+"\nedu - "+edu+"\nother - "+other);



    }

}
