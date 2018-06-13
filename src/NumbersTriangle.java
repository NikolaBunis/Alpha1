// in-class problem


import java.util.Scanner;

public class NumbersTriangle {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        trianglePrinting(N);

    }


    static void trianglePrinting(int number){

//the below code prints the upper par of the triangle, the nested cycles start from printing a single number - 1
// and go down until they reach the given number (making it the tip of the pyramid sort of speak)
        for (int i = 1; i<= number; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");


            }
            System.out.println();
        }
        //the below nested cycles act similarly to the first ones, only they take the opposite approach
        // the start from the full printed sequence ( from 1 to the given number)
        // and take one number out until they reach the bottom (where we again have a single digit 1)


        for (int i = number -1; i >= 1; i--){
            for (int j = 1; j <= i; j++ ){
                System.out.print(j + " ");

            }
            System.out.println();


        }
        
        

    }


}


/*
    You are given the number N.

        Based on it, print triangles as follows:

        Example: N = 3
        Copy

        1
        1 2
        1 2 3
        1 2
        3

        Example: N = 5
        Copy

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

        Input

        Read from the standard input

        From the first line of the input, read the number N

        Output

        Print to the standard output

        Print the triangle on 2*N - 1 lines

        Sample tests
        Input
        Copy

        3

        Output
        Copy

        1
        1 2
        1 2 3
        1 2
        3

        Input
        Copy

        5

        Output
        Copy

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
*/

