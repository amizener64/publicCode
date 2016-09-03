package basicjava;

import java.util.Scanner;

/**
 * Created by andrewmizener on 9/3/16.
 */
public class TimeConverter {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String[] timesAsStrings;
        System.out.println("Please enter a time in the format hours:minutes:seconds .");
        String rawTime = s.nextLine();
        timesAsStrings = rawTime.split(":");
        int hours = Integer.parseInt(timesAsStrings[0]);
        int minutes = Integer.parseInt(timesAsStrings[1]);
        int seconds = Integer.parseInt(timesAsStrings[2]);
        int totalSeconds = seconds + (minutes*60) + (hours*60*60);
        System.out.println("Your time included a total of " + totalSeconds + " seconds.");
    }
}
