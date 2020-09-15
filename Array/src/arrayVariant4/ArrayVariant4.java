package arrayVariant4;

import java.util.Scanner;

/**
 * An integer N (> 1) is given, as well as the first term A and the denominator D of a geometric progression.
 * Form and output an array of size N containing the first N members of the given progression:
 * A, A * D, A * D^2, A * D^3,  ….
 */
public class ArrayVariant4 {

    public static void main(String[] args){

        System.out.println("enter size of progression");
        int size = getSizeProgression();

        System.out.println("enter first element of progression");
        double firstElem = getNotZeroDouble();

        System.out.println("enter denominator");
        double denominator = getNotZeroDouble();

        double[] array = fillArray(size,firstElem,denominator);

        showArray(array);
    }

    /**
     *
     * @return int number > 2
     */
    public static int getSizeProgression(){
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while(size < 2){
            System.out.println("enter element:");

            if(scanner.hasNextInt()) {
                size = scanner.nextInt();
            }
            else {
                scanner.next();
            }
        }

        return size;
    }

    /**
     *
     * @return double number which != 0
     */
    public static double getNotZeroDouble(){
        Scanner scanner = new Scanner(System.in);
        double elem = 0d;

        while(elem == 0d){
            System.out.println("enter element:");

            if(scanner.hasNextDouble()) {
                elem = scanner.nextDouble();
            }
            else {
                scanner.next();
            }
        }

        return elem;
    }

    /**
     *
     * @param size size of array
     * @param firstElem first element in progression
     * @param denominator denominator in progression
     * @return filled array as a rule: firstElem * denominator^i (i = 0 to size)
     */
    public static double[] fillArray(int size, double firstElem, double denominator){
        double[] array = new double[size];

        for (int i = 0;i < size;i++){
            array[i] = firstElem * Math.pow(denominator,i);
        }

        return array;
    }

    /**
     *
     * @param array which is displayed in the console
     */
    public static void showArray(double[] array){
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

}
