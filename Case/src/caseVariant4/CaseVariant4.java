package caseVariant4;

import java.util.Scanner;

/**
 *You are given a month number - an integer in the range 1–12
 * (1 - January, 2 - February, etc.).
 * Determine the number of days in this month for a non-leap year.
 */
public class CaseVariant4 {
    public static void main(String[] args){
        // entering month number
        int monthNumber = getMonthNumber();

        // showing month name
        System.out.println(getMonthDaysCount(monthNumber));

    }

    /**
     *
     * @return month number in range [1 ... 12]
     */
    public static int getMonthNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number < 1 || number > 12){
            System.out.println("enter month number:");

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
     * @param monthNumber
     * @return count of days in month
     */
    public static int getMonthDaysCount(int monthNumber){
        // better use if
        switch (monthNumber){
            case 1: return 31;
            case 2: return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }
}
