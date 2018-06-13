
// a failed experiment...


import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class TribonacciRecursive {


    static ArrayList<BigInteger> startingNumbersList = new ArrayList<>();

    private static void fakeInput() {
        String test = "2\n"+
                "3\n"+
                "4\n"+

                "10";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }


    public static void main (String[] args){

        fakeInput();

        Scanner in = new Scanner (System.in);

        startingNumbersList.add(BigInteger.valueOf(in.nextInt()));
        startingNumbersList.add(BigInteger.valueOf(in.nextInt()));
        startingNumbersList.add(BigInteger.valueOf(in.nextInt()));



        int N = in.nextInt();

       System.out.println(tribonacci(N));

String List = startingNumbersList.toString();



    }


    static BigInteger tribonacci(int N){

       int size = startingNumbersList.size();

BigInteger Nminus1 = BigInteger.valueOf(N).subtract(BigInteger.ONE);
BigInteger Nminus2 = BigInteger.valueOf(N).subtract(BigInteger.TWO);
BigInteger Nminus3 = BigInteger.valueOf(N).subtract(BigInteger.valueOf(3));
int tribonacciFormula = Nminus1.intValueExact() + Nminus2.intValueExact() + Nminus3.intValueExact();


if (N == startingNumbersList.get(0).intValueExact()){

    return startingNumbersList.get(0);

}

else if (N == startingNumbersList.get(1).intValueExact()){

    return  startingNumbersList.get(1);

}

else if (N == startingNumbersList.get(2).intValueExact()){

    return  startingNumbersList.get(2);
}

else{
    if(size > N) {
return startingNumbersList.get(N);
    }
    else{
        startingNumbersList.add(tribonacci(tribonacciFormula));

        return startingNumbersList.get(N);
    }

}





    }




}

    /*The Tribonacci sequence is a sequence in which every next element is made by the sum of the previous three elements from the sequence.

        Write a computer program that finds the Nth element of the Tribonacci sequence, if you are given the first three elements of the sequence and the number N. Mathematically said: with given T1, T2 and T3 – you must find Tn.
        Input

        Read from the standard input

        The values of the first three Tribonacci elements will be given on the first three input lines.

        The number N will be on the fourth line. This is the number of the consecutive element of the sequence that must be found by your program.

        The input data will always be valid and in the format described. There is no need to check it explicitly.

        Output

        Print to the standard output

        At the only output line you must print the Nth element of the given Tribonacci sequence.

        Constraints

        The values of the first three elements of the sequence will be integers between -2 000 000 000 and 2 000 000 000.

        The number N will be a positive integer between 1 and 15 000, inclusive.

        Sample Tests

        Input 	Output
        1
        1
        1
        4 	3
        2
        3
        4
        10 	335*/