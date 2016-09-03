package basicjava;

import java.util.Scanner;
/**
 * Created by andrewmizener on 9/3/16.
 */
public class ChessBoard {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Input row and column numbers (1-8)");
        System.out.println("This program assumes the chessboard is in Quadrant I ");
        System.out.println("As well as that rows -> y axis & columns -> x axis. ");
        System.out.println("Enter row number: ");
        int row = s.nextInt();
        s.nextLine();
        System.out.println("Enter column number: ");
        int col = s.nextInt();
        if ((row % 2) == 0){
            if ((col % 2) == 0){
                System.out.println("Dark square");
            }
            else{
                System.out.println("Light square");
            }
        }
        else{
            if ((col % 2) == 0){
                System.out.println("Light square");
            }
            else{
                System.out.println("Dark square");
            }
        }
    }
}
