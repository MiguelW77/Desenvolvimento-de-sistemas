import java.util.Scanner;

public class TryCatchEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer x ;
        Integer y ;

        try{
            System.out.println("*** Division by zero ***");
            System.out.println("--ENTER TWO NUMBER FOR DIVISION--");
            x = scan.nextInt();
            System.out.println("--ENTER ANOTHER VALUE--");
            y = scan.nextInt();
            Integer result = x/y;
            System.out.println ("DIVISION RESULT: " + result );
        } catch (ArithmeticException e) {
            System.out.println("ERROR! Invalid division!");


        }


    }
}