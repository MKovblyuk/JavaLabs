package ifVariant4;

import java.util.Scanner;

/**
 * Three integers are given.
 * Find the number of positive numbers in the original set.
 */
public class IfVariant4 {
    public static void main(String[] args){
        // entering data
        System.out.println("enter first number");
        int a = getInteger();

        System.out.println("enter second number");
        int b = getInteger();

        System.out.println("enter third number");
        int c = getInteger();

        // showing result
        System.out.println(getCountPositive(a,b,c));
    }

    /**
     *
     * @return integer number
     */
    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("enter number:");

            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }
            else {
                scanner.next();
            }
        }
    }

    /**
     * compares three numbers and counts the number of positive numbers
     * @param a first number
     * @param b second number
     * @param c third number
     * @return count of positive numbers
     */
    public static int getCountPositive(int a,int b,int c){
        int count = 0;

        if(a > 0) count ++;
        if(b > 0) count ++;
        if(c > 0) count ++;

        return count;
    }
}
