/* Exercício referente ao problema 1 das "Condições com string" */

package program.Java;
import java.util.Scanner;
public class IfElseOOP1 {

    public static void main(String[] args) {

            System.out.println("Digite uma palavra:");
            Scanner scan = new Scanner(System.in);
            String palavradigitada = scan.nextLine();

            String palavradigitada1 = p1(palavradigitada);

            showresult(palavradigitada1);

            scan.close();
        }

        private static void showresult(String palavradigitada1) {
            System.out.println( "Palavra digitada: "  + palavradigitada1);
        }

        public static String p1(String palavradigitada) {
            String p1;
            if (palavradigitada == "sim") {
                palavradigitada = "sim";
            } else if (palavradigitada == "nao") {
                palavradigitada = "nao";
            }

            {
                return palavradigitada;
            }

        }
    }




