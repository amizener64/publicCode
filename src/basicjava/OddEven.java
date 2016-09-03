package basicjava;
import java.util.Scanner;
/**
 * Created by andrewmizener on 9/2/16.
 */
public class OddEven {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("This progam determines whether a number is even or odd.");
        System.out.println("Please input a number now: ");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("You've entered an even number.");
        }
        else {
            System.out.println("You've entered an odd number.");
        }
    }
}
