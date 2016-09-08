package calc237_misc;
import java.util.*;
/**
 * Created by andrewmizener on 9/8/16.
 */
public class CollatzConj {
    public static void main(String[] args){
        //Calculates the number of steps it takes to reach 1 via the Collatz conjecture
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        while(true){
            if (num==1){
                break;
            }
            count++;
            if (num%2 == 0){
                num = num/2;
            }
            else{
                num = (3*num)+1;
            }
        }
        System.out.println(count + " steps.");
    }
}
