package program;

import java.util.Scanner;

public class Básicos5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int z;
        int x;
        int y;
        int maior ;

        System.out.println("Insira três números para exibição do maior deles:");
        z = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();

    if ( z > x || z > y )
     {maior = z;
            System.out.println("Maior número" + maior );

    }
  if ( x > z || x > y ) { maior = x;
    System.out.println("Maior número" + maior);

        }

    if ( y > x || y > z){ maior = y;
        System.out.println("Maior número" + maior);

        }
}
}

