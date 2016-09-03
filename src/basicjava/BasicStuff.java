package basicjava;
import java.util.Scanner;

/**
 * Created by andrewmizener on 9/2/16.
 */
public class BasicStuff {
    public static void main(String args[]){

        int age = 19;
        System.out.println("I am " + age + " years old!");
        double num1 = 6/3;
        double num2 = 6/4; //This is 1.0 because 6 and 4 are being treated like ints, not doubles. We're seeing modulo
                           //operations. IF we declared 6.0 1nd 4.0 as doubles and divided, the answer would be 1.5
        System.out.println(num1);
        System.out.println(num2);

        System.out.println(Integer.MIN_VALUE); //This represents the minimum value than an int can hold
        System.out.println(Integer.MIN_VALUE-1); //The -1 operation flips the sign bit, making it positive. Integer overflow.
        System.out.println(Integer.MAX_VALUE);

        //Code for hours/days/weeks
        double hours = 1600.0;
        double days = hours/24.0;
        double weeks = days/7.0;
        System.out.println("There are " + days + " days or " + weeks + " weeks in " + hours + " hours.");

        //Code for volume of solids
        double rad = 2;
        double height = 5;
        double V = rad * rad * Math.PI * height / 3.0;
        double A = (Math.PI * rad * rad) + ((Math.PI * rad) * Math.sqrt((rad*rad)+(height*height)));
        System.out.println("Volume is " + V);
        System.out.println("Area is " + A);

    }

}
