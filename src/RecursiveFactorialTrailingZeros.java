// an attempt to solve an old problem recursively, sadly numbers such as 100000! cause a stack overflow


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class RecursiveFactorialTrailingZeros {

    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = BigInteger.valueOf(Integer.parseInt(reader.readLine()));


        BigInteger factorial = factorialNumber(N);

        int counter = 0;

        while (factorial.mod(BigInteger.TEN) == BigInteger.ZERO){


            counter++;
            factorial = factorial.divide(BigInteger.TEN);

        }

        System.out.println(counter);



    }

    static BigInteger factorialNumber(BigInteger number){

        if (number.equals(BigInteger.ONE)){

            return number;
        }

return number.multiply(factorialNumber(number.subtract(BigInteger.ONE)));

    }




}


    /*Write a program that calculates with how many zeroes the factorial of a given number N has at its end.

        Your program should work well for very big numbers, e.g. N = 100000

        Input

        On the only input line, you will receive a single integer - the number N

        Output

        Output a single number - the count of trailing zeroes for the N!

        Constraints

        N will always be a valid positive integer number.
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output 	Explanation
        10 	2 	3628800
        20 	4 	2432902008176640000
        100000 	24999 	think why*/