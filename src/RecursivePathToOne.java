/*You are given a number N.

        You can perform 3 operations with N:

        Didive it by 2
        Only available if N is even
        Increment by 1
        Decrement by 1

        You task is to calculate the minumum count of operations, the can make N equal to 1
        Input

        Read from the standard input
        On the single line read the number N

        Output

        Print to the standard output
        On the single line print the minimum count of operations

        Constraints

        1 <= N <= 232

        Sample tests
        Test 1

        Input

        Copy

        15

        Output

        Copy

        5

        Clarification
        Some of the possible set of operations are
        Copy

        15 -> 16 -> 8 -> 4 -> 2 -> 1 (count 5) **best**
        15 -> 14 -> 7 -> 8 -> 4 -> 2 -> 1 (count 6)
        15 -> 14 -> 7 -> 6 -> 3 -> 2 -> 1 (count 6)*/


import java.util.Scanner;

public class RecursivePathToOne {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int N = in.nextInt();

        System.out.println(pathToOne(N));

    }


    static int pathToOne(int n) {

        int division = n / 2;
        int decrement = n - 1;
        int increment = n + 1;
        int modulus = n % 2;


        if (n == 1) return 0;

        if (modulus == 0) {

            return 1 + pathToOne(n / 2);

        }

        if (modulus != 0) {

            if (((n - 1) / 2) % 2 == 0 || (n-1) / 2 == 1)

                return 1 + pathToOne(n - 1);

            else if (((n + 1) / 2) % 2 == 0) {

                return 1 + pathToOne(n + 1);
            }

        }

        return n;


    }


}
