package integerVariant4;

import java.util.Scanner;

/**
 * Given positive integers A and B (A> B).
 * The segment of length A contains the maximum possible number of segments of length B (without overlaps).
 * Using the integer division operation, find the number of line segments B located on segment A
 */
public class IntegerVariant4 {
    public static void main(String[] args)
    {
        // entering data
        System.out.println("enter A");
        int a = getPositiveInteger();

        System.out.println("enter B");
        int b = getPositiveInteger();

        // showing result
        System.out.println(getSegments(a,b));

}

    /**
     *
     * @return positive int number
     */
    public static int getPositiveInteger(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number <= 0){
            System.out.println("enter number:");

            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }
            else{
                scanner.next();
            }
        }

        return number;
    }

    /**
     *
     * @param a
     * @param b
     * @return a / b
     */
    public static int getSegments(int a,int b){
        return a / b;
    }
}
