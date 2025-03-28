import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer y;
        Integer z;
        Integer result;
        try {
            System.out.println("*** Sum of Two Numbers ***");
            System.out.println("--ENTER A NUMBER--");
            z = scan.nextInt();
            System.out.println("--ENTER A ANOTHER NUMBER--");
            y = scan.nextInt();
            result = y + z;
            System.out.println("Sum of the two number entered is " +" " + result);
        }catch (NumberFormatException e) {
        }catch (InputMismatchException e){
            System.out.println("ERROR! INVALID VALUE!");
        }
    }

    }

