package basicjava;
import java.util.Scanner;
/**
 * Created by andrewmizener on 9/3/16.
 */
public class LegalDriver {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(s.nextLine());
        System.out.println("Do you have a valid driver's license? Enter 'y' or 'n'.");
        String validity = s.nextLine();
        boolean validBool = validity.equals("y"); // will return "true" into validBool if 'y' was entered, false if not
        if (validBool && (age>=16)){
            System.out.println("You're legally allowed to drive.");
        }
        else{
            System.out.println("You're not legally allowed to drive.");
        }
    }
}
