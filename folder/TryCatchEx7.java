import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double x,y,z;
        Double media;
        try{
            System.out.println("*** CALCULATOR OF AVERAGE NOTES ***");
            System.out.println("ENTER A FIRST NOTE:");
            x = scan.nextDouble();
            System.out.println("ENTER A SECOND NOTE:");
            y = scan.nextDouble();
            System.out.println("ENTER A THIRD NOTE:");
            z = scan.nextDouble();
            media = x + y + z / 3 ;
            System.out.println("Average of notes entered is: " + " " + media);


        }catch (InputMismatchException e){
            System.out.println("ERROR! INVALID VALUE!");

        }
    }
}
