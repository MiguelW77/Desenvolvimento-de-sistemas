
import java.util.Scanner;

public class TryCatchEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer z = 0;
        try {
            System.out.println("*** Square root of a number ***");
            System.out.println("--ENTER A NUMBER--");
            z = scan.nextInt();
            scan.close();
            if (z < 0){
            throw new IllegalArgumentException("ERROR! NEGATIVE NUMBER ENTERED!");
            } else{
                System.out.println("ENTERED NUMBER: " + z);
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
    }
}
