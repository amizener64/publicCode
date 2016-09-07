package basicjava;

import java.util.Scanner;
/**
 * Created by andrewmizener on 9/3/16.
 */
public class LetterGrade {

    public static final int NUM_GRADES = 3;

    public static void main(String[] argss){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of assignments to be averaged, between 3 and 5.");
        int numAssignments = Integer.parseInt(s.nextLine()); // I do this to advance the line in the scanner
        double percentSum = 0;
        System.out.println("Please enter the percentage achieved on each assignment, w/o the % sign.");
        for (int i = 0; i < numAssignments; i++){
            System.out.println("Please enter an assignment grade now: ");
            percentSum += s.nextDouble();
        }
        double averageGrade = (double)percentSum / (double)numAssignments;
        if (averageGrade >= 90.0) {
            System.out.println("A average!");
        }
        else if ((90.0 > averageGrade) && (averageGrade > 80.0)){
            System.out.println("B average!");
        }
        else if ((80.0 > averageGrade) && (averageGrade > 70.0)){
            System.out.println("C average!");
        }
        else if ((70.0 > averageGrade) && (averageGrade > 60.0)){
            System.out.println("D average!");
        }
        else {
            System.out.println("F average. :(");
        }
    }
}
