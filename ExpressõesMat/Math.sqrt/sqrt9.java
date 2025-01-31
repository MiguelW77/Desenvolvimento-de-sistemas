package program.Math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class sqrt9 {
    public static void main(String[] args) {


        double a = 10;
        System.out.println(Math.sqrt(a));

        BigDecimal bd = new BigDecimal(Math.sqrt(a));
        bd = bd.setScale(1, RoundingMode.HALF_UP);

        System.out.println("Valor arredondado" + bd);
    }
}