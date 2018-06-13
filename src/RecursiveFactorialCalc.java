import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveFactorialCalc {

    public static void main (String[] args){


        Scanner in = new Scanner(System.in);


        BigInteger N = BigInteger.valueOf(in.nextInt());

        BigInteger K = BigInteger.valueOf(in.nextInt());


        System.out.println(factorialCalc(N).divide((factorialCalc(K).multiply(factorialCalc(N.subtract(K))))));




    }


    static BigInteger factorialCalc(BigInteger number){

        if ( number.equals(BigInteger.ONE)|| number.equals(BigInteger.ZERO)  ){

            return BigInteger.ONE;
        }


        return number.multiply(factorialCalc(number.subtract(BigInteger.ONE)));





    }


}

   /* n combinatorics, the number of ways to choose N different members out of a group of N different elements (also known as the number of combinations) is calculated by the following formula: formula For example, there are 2598960 ways to withdraw 5 cards out of a standard deck of 52 cards. Your task is to write a program that calculates N! / (K! * (N - K)!) for given N and K.

        _Try to use only two loops._

        Input

        On the first line, there will be only one number - N
        On the second line, there will also be only one number - K

        Output

        On the only output line, write the result of the calculation for the provided N and K

        Constraints

        1 < K < N < 100
        _Hint: overflow is possible_
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        3
        2 	3
        4
        2 	6
        10
        6 	210
        52
        5 	2598960*/