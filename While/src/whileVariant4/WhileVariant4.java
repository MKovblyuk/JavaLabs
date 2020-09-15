package whileVariant4;

import java.util.Scanner;

/**
 * An integer N (> 0) is given. If it is a power of 3,
 * then output True, if it is not, output False
 */
public class WhileVariant4 {
    public static void main(String[] args){
        // entering data
        int n = getPositiveInteger();

        // showing result
        System.out.println(checkPower(n));
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
     * @param n the number being checked
     * @return ture if n - is a power of 3 else return false
     */
    public static boolean checkPower(int n){
        int i = 0;
        int temp = 0;
        while(temp < n){
            temp = (int) Math.pow(3,i);
            if(temp == n)return true;
            i++;
        }
        return false;
    }
}
