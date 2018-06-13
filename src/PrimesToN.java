// in-class problem
// I already had a solution, I just split it into methods for today's lecture's purposes

import java.util.Scanner;

public class PrimesToN {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        printPrimesToNumber(N);


    }

// this method does the printing that is required as output
    static void printPrimesToNumber (int number) {



        for (int i = 1; i <= number; i++) {


//it cycles through the numbers between 1 and the given number
            //checks if the current number is prime via a bool method
            // if yes, prints it as required by the problem's conditions

            if (primeCheck(i)) {
                System.out.print(i + " ");

            }


        }

    }
// this method takes an integer number and determines if it's prime or not.
   public static boolean primeCheck(int number){



        int maxDivider = (int) Math.sqrt(number);
        int divider = 2;
        boolean primeCheck = true;


        while (primeCheck && (divider <= maxDivider)) {
            if (number % divider == 0) {
                primeCheck = false;
            }
            divider++;



        }
        if (primeCheck) {
            return true;
        }
        else {
            return false;
        }

    }



    }




  /*  Print all the prime numbers between 1 and N
        Input

        Read from the standard input

        On the single line, read the number *

        Output

        Print on the standard output

        Print all the prime numbers, separated by a single whitespace

        Constraints

        1 <= N <= 1024
        1 is considered prime

        Sample tests
        Input
        Copy

        15

        Output
        Copy

        1 2 3 5 7 11 13

        Input
        Copy

        24

        Output
        Copy

        1 2 3 5 7 11 13 17 19 23

*/




