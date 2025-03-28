package TryCatchEx10p;
import java.util.Scanner;
public class TryCatchEx10 {

    public class TryCatchEx10p {
        public static long fatorial(int n) throws NumeroNegativoException, LimiteFatorialExcedidoException {
            if (n < 0) {
                throw new NumeroNegativoException("Negative number not allowed for factorial.");
            }
            if (n > 20) {
                throw new LimiteFatorialExcedidoException("This number exceeds limit for factorial calculer.");
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * fatorial(n - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("--TYPE A NUMBER FOR A FACTORIAL CALC--");
            int num = sc.nextInt();
            long resultado = TryCatchEx10p.fatorial(num);
            System.out.println("The factorial this" + " " + num + " is : " +" "+ resultado);
        } catch (NumeroNegativoException | LimiteFatorialExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid entry. Type a integer number.");
        } finally {
            sc.close();
        }
    }
}
