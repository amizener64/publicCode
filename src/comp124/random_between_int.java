package comp124;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by andrewmizener on 9/1/16.
 */

public class random_between_int {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int max_int = s.nextInt();
        Random r = new Random();
        int num_out = r.nextInt(max_int);
        System.out.println(num_out);
    }
}
