// in-class problem
// simple loop, but added in a separate method for the purpose of exercising methods.

import java.util.Scanner;

public class NumbersToN {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        int N = in.nextInt();

        primesToNumber(N);

    }


    static void primesToNumber (int number){

        for (int i = 1; i < number; i++) {

            System.out.print(i + " ");

        }
       // this is to avoid a whitespace at the end of the sequence
        System.out.print(number);




    }



}

  /*  Write a program that enters from the console a positive integer n and prints all the numbers from 1 to N inclusive, on a single line, separated by a whitespace.
        Input

        The input will consist of a single line - the number N

        Output

        The output should consist of a single line - the numbers from 1 to N, separated by a whitespace

        Constraints

        N will be a valid positive 32-bit integers
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        5 	1 2 3 4 5
        1 	1*/