/* Exercício referente ao problema 1 de "Operações Matemáticas" */

package program.Java;
import java.util.Scanner;
public class IfElseOOP2 {

    public static void main(String[] args) {
        System.out.println("Entre com dois números:" );
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int soma = y +x;
        int Objeto = ResultadoSoma(soma);
        MostrarResultado(Objeto);
        scan.close();
    }
    public static int ResultadoSoma(int soma){

        if(soma > 100) {
            System.out.println("Soma maior que 100!");

        } else if ( soma == 100) {
            System.out.println("Soma igual a 100!");
        } else {
            System.out.println("Soma não é maior que 100!");
        }
        return soma;
    }
    private static void MostrarResultado(int Objeto) {
     System.out.println("Resultado:" + Objeto);
 }
}
