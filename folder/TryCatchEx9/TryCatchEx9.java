package TryCatchEx9;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double CelsiusTemp;
        Double FarenhTemp;
        try {
            System.out.println("*** TEMPERATURE CONVERSION WHIT RANGE CHECK ***");
            System.out.println("ENTER A CELSIUS TEMPERATURE:");
            CelsiusTemp = scan.nextDouble();
            FarenhTemp = (CelsiusTemp * 1.8) + 32;
            System.out.println("Fahrenheit temperature entered is " + " " + FarenhTemp);
            if (CelsiusTemp <= -273.15) {
                throw new LimiteFatorialExcedidoException();
            }
        }catch(LimiteFatorialExcedidoException e){
                System.out.println("ERROR! INVALID TEMPERATURE!");
                e.printStackTrace();
            }
        catch(InputMismatchException a){
            System.out.println("ERROR! INVALID VALUE ENTERED");
        }

    }
}
