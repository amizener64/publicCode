package basicjava;
import java.util.Scanner;

/**
 * Created by andrewmizener on 9/2/16.
 */
public class Hypotenuse {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates the hypotenuse of a right triangle given two legs.");
        System.out.println("Please enter the length of leg 1: ");
        double a = s.nextDouble();
        System.out.println("Please enter the length of leg 2: ");
        double b = s.nextDouble();
        double c = Math.sqrt((a*a) + (b*b)); // pythagorean theorem
        System.out.println("The hypotenuse is " + c + " units long.");
    }

}
