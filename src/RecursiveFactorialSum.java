import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveFactorialSum {

    public static void main (String[] args){


        Scanner in = new Scanner(System.in);


        BigInteger N = BigInteger.valueOf(in.nextInt());

        BigInteger K = BigInteger.valueOf(in.nextInt());


        System.out.println(factorialCalc(N).divide(factorialCalc(K)));




    }


    static BigInteger factorialCalc(BigInteger number){

        if ( number.equals(BigInteger.ONE)|| number.equals(BigInteger.ZERO)  ){

            return BigInteger.ONE;
        }


        return number.multiply(factorialCalc(number.subtract(BigInteger.ONE)));





    }


}

   /* Write a program that calculates N! / K! for given N and K.

        Use only one loop.

        Input

        On the first line, there will be only one number - N
        On the second line, there will be only one number - K

        Output

        Output a single line, consisting of the result from the calculation described above.

        Constraints

        1 < K < N < 100
        Hint: overflow is possible
        N and K will always be valid integer numbers
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        5
        2 	60
        6
        5 	6
        8
        3 	6720*/