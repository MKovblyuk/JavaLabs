package BooleanVariant4;

import java.util.Scanner;

/**
 * Two integers are given: A, B. Check the truth of the statement:
 * "The inequalities A> 2 and B < 3 are true"
 */
public class BooleanVariant4 {
    public static void main(String[] args){
        // entering a and b
        System.out.println("enter a");
        int a = getInteger();

        System.out.println("enter b");
        int b = getInteger();

        // showing results
        //System.out.println(a > 2 && b < 3);
        System.out.println(checkStatement(a,b));

    }

    /**
     *
     * @return integer number
     */
    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);
        int elem = 0;

        while(true){
            System.out.println("enter element:");

            if(scanner.hasNextInt()) {
                elem = scanner.nextInt();
                return elem;
            }
            else {
                scanner.next();
            }
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return a > 2 && b < 3
     */
    public static boolean checkStatement(int a,int b){
        return a > 2 && b < 3;
    }
}
