import java.util.Scanner;

public class NonDivisibleNumbers {

    //needlessly complicated, but still enables practicing method usage

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {


            if(notDivisibleBy3(i) && notDivisibleBy7(i)){

                System.out.print(i + " ");

            }


        }




    }



    static boolean notDivisibleBy3 (int number){

        if (number % 3 != 0){

            return true;
        }

        else return false;
    }

    static boolean notDivisibleBy7 (int number){

        if (number % 7 != 0){

            return true;
        }

        else return false;
    }


}

   /* Write a program that reads from the console a positive integer N and prints all the numbers from 1 to N not divisible by 3 or 7, on a single line, separated by a space.
        Input

        Will always consists of one valid integer number - the number N.

        Output

        Should always consists of the numbers from 1 to N, which are not divisible by 3 or 7, separated by a whitespace.

        Constraints

        1 < N < 1500
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        10 	1 2 4 5 8 10
        3 	1 2*/