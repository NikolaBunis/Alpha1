//shockingly, I managed this on my own


import java.util.Scanner;

public class GCD {

    public static void main (String[] args)  {


        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        int B = in.nextInt();






     //   System.out.println(A + ", " + B);


     System.out.println(calcGCD(A, B));

    }

//the marvelous recursive method itself
    public static int calcGCD (int A, int B){
/*
        A variable to make it easier to track A mod B. This operation gives a non-mathematical result, but this helps
        as it enables the method to find the GCD regardless if the larger number is given first or second in the signature.
        Example: 695 / 1112 = 0.625 in a calculator, but int mod = 695 % 1112 does not result in mod = 625.
        Rather, int mod = 695 % 1112 yields mod = 695 and via this perk, the values of A and B are reversed in the first recursive call if A < B.
        Afterwards the method continues as planned and returns the final result.
        */
        int mod = A % B;
//the recursion's bottom, per the Euclidean algorithm, the largest common divider will always be the smaller number if the module is zero
        if (mod == 0){

            return B;

        }

//this is essential for the method to work, as the algorithm relies on calculations to continue until you reach a point where A % B = 0
        //third variable to store B's value, as we need to give it to A for the next function
        int interimB = B;
        //B is now the remainder of the division between A and B
        B = A % B;
        //A is now the old B
        A = interimB;
// and we recursively call the method for the new numbers
        //as we dig down, we will eventually reach a point where A % B equals zero, so the method will return B, which at that point will be the GCD
        return calcGCD(A, B);

    }

}


    /*Write a program that calculates the greatest common divisor (GCD) of given two integers A and B.

        Use the Euclidean algorithm (find it in Internet).

        Input

        On the first and only line of the input you will receive the 2 integers A and B, separated by a whitespace.

        Output

        Output a single number - the GCD of the numbers A and B.

        Constraints

        The numbers A and B will always be valid integers in the range [2, 500].
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        3 2 	1
        60 40 	20
        5 15 	5*/