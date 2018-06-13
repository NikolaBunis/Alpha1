import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Tribonacci {



    private static void fakeInput() {
        String test = "2\n"+
                "3\n"+
                "4\n"+

                "10";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }



    public static void main (String[] args){

       // fakeInput();

        Scanner in = new Scanner(System.in);

        ArrayList<BigInteger> tribonacciNumbers = new ArrayList<>();

        tribonacciNumbers.add(BigInteger.valueOf(in.nextInt()));
        tribonacciNumbers.add(BigInteger.valueOf(in.nextInt()));
        tribonacciNumbers.add(BigInteger.valueOf(in.nextInt()));

        int N = in.nextInt();


        for (int i = 3; i < N; i++) {

            tribonacciNumbers.add(tribonacciNumbers.get(i-1).add(tribonacciNumbers.get(i-2)).add(tribonacciNumbers.get(i-3)));

            //System.out.print(tribonacciNumbers.get(i) + " ");

        }

      //  System.out.println();
       System.out.println(tribonacciNumbers.get(N-1));
      //  System.out.println(tribonacciNumbers.get(tribonacciNumbers.size()-1));



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
