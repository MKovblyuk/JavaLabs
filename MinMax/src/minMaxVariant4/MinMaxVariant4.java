package minMaxVariant4;

import java.util.Scanner;

/**
 * You are given an integer N and a set of N numbers.
 * Find the number of the minimum element from the given set.
 */
public class MinMaxVariant4 {
    public static void main(String[] args){
        // entering size of array
        System.out.println("enter number of elements");
        int n = getPositiveInteger();

        // filling array
        int[] array = getFilledArray(n);

        // showing number of minimal element
        System.out.println("number of minimal element = " + getNumberOfMin(array));

    }

    /**
     *
     * @return positive int number
     */
    public static int getPositiveInteger(){
        int number;

        while (true){
            number = getInteger();
            if(number > 0) return number;
        }
    }

    /**
     *
     * @return int number
     */
    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("enter number:  ");

            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }
            else {
                scanner.next();
            }
        }
    }

    /**
     *
     * @param size of array
     * @return filled array
     */
    public static int[] getFilledArray(int size){
        int[] array = new int[size];

        for(int i = 0;i < size;i++){
            System.out.println("enter " + (i + 1) + " element");
            array[i] = getInteger();
        }

        return array;
    }

    /**
     *
     * @param array in which the search takes place
     * @return the number of the minimum element
     */
    public static int getNumberOfMin(int[] array){
        int min = array[0];
        int minNumber = 1;

        for(int i = 1;i < array.length; i++){
            if(min > array[i]){
                min = array[i];
                minNumber = i + 1;
            }
        }

        return minNumber;
    }
}
