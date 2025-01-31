package program.Math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class sqrt17 {
    public static void main(String[] args) {


        double a = 0.001;
        System.out.println(Math.sqrt(a));

        BigDecimal bd = new BigDecimal(Double.toString(a));
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Valor arredondado" + bd); }
}