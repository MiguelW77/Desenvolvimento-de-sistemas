import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TryCatchEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] nums = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        Integer z;
        try{
            System.out.println("*** INVALID ACESS A INDEX IN ONE ARRAY *** ");
            System.out.println(" ENTER A INDEX FOR POSITION IN ARRAY: ");
            z = scan.nextInt();
            Integer position = nums[z];
            System.out.println("Value in position selected:" + " " + position);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR! INVALID POSITION IN ARRAY!");

        }

    }
}
