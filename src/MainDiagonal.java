import java.util.Scanner;

public class MainDiagonal {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        int N = in.nextInt();

        long array[][] = new long [N][N];
//squared table

        array[0][0] = 1;
//anchor at 1 at the start

        for (int i = 1; i < N; i++){

array[i][0] = array[i-1][0] * 2;
//fill in the first column, so you can multiply by 2 at each row
        }

        for (int i = 0; i < N; i++){

            for (int j = 1; j < N; j++){

                array[i][j] = array[i][j - 1] *2;
                //multiply by 2 at each row (could not figure this without a separate for loop)

                }}

                long sum = 0;
// sum variable for printing
        for (int i = 0; i < N; i++){
//for each row
            for (int j = N-1; j > i; j--) {
//traverse backwards and add to the sum
                // stop when you reach the diagonal - when the i and j indexes are equal
                sum += array[i][j];

            }

            }

        System.out.println(sum);




    }



}


/*
You are given a square matrix of numbers, formed by powers of 2. See example

_Example_: N = 4
Copy

 1  2  4  8
 2  4  8 16
 4  8 16 32
 8 16 32 64

The result is: 2 + 4 + 8 + 8 + 16 + 32 = 70

You task is to find the sum above the main diagonal.
Input

Read from the standard input

    On the first line, read the number N
        The number of rows and columns

Output

Print to the standard output

    On the first line, print the sum of the numbers above the main diagonal except the diagonal

Sample tests
Input
Copy

4

Output
Copy

70


 */