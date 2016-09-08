package SentinelDrills;

import java.util.Scanner;

/**
 * Created by andrewmizener on 9/7/16.
 */
public class SentinelDrills {
    public static void main(String[] args){
        EvenOddNegative();
        DivideUntilOne();
        CompoundInterest();
    }
    public static void EvenOddNegative(){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("This progam determines whether a number is even or odd.");
        System.out.println("This version requires a negative version to be input.");
        System.out.println("Please input a number now: ");
        while(true){ // This is a read-until-sentienl loop.
            num = s.nextInt();
            if (num < 0){
                break;
            }
            else{
                System.out.println("Enter a negative number. ");
            }
        }
        if (num % 2 == 0) {
            System.out.println("You've entered an even number.");
        }
        else {
            System.out.println("You've entered an odd number.");
        }
    }
    public static void DivideUntilOne(){
        System.out.println("Please input an even number.");
        Scanner s = new Scanner(System.in);
        int num; // Sentinel loop
        while(true){
            num = s.nextInt();
            if (num%2 != 0){
                System.out.println("Enter an even number.");
            }
            else {
                break;
            }
        }
        int count = 0; // counts number of loop repetitions
        while(true){ // Sentinel loop
            num = num/2;
            count++;
            if (num == 1) {
                break;
            }
        }
        System.out.println("The program has looped " + count + " times to reach a value of 1.");

    }
    public static void CompoundInterest(){
        int principal = 1000;
        double yearlyInterestRate = 4;
        System.out.println("Please input a requested final balance in dollars.");
        System.out.println("This program will determine a time period for investment, given");
        System.out.println("a principal of $1000 and yearly interest of 4%.");
        Scanner s = new Scanner(System.in);
        int goalAmount = s.nextInt();
        int years = 0;
        while(true){ //read-until-sentinel
            double futureAmount = principal * Math.pow( 1 + ( yearlyInterestRate/100.0 ), years);
            if (futureAmount >= goalAmount){
                break;
            }
            years++;
        }
        System.out.println("In " + years + " years, the investment will have reached or exceeded your goal.");

    }
}
