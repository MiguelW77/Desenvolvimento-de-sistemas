import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer z;
        try {
            System.out.println("*** Conversion String for a Number ***");
            System.out.println("--ENTER A NUMBER--");
            z = scan.nextInt();
            System.out.println("ENTERED NUMBER:" +" "+ z);
        }catch (NumberFormatException e) {
        }catch (InputMismatchException e){
            System.out.println("ERROR! INVALID VALUE!");
        }
    }
}

