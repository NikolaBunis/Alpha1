import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quadronacci {

    private static void fakeInput() {
        String test = "1\n" +
                "1\n" +
                "0\n" +
                "5\n" +
                "10\n" +
                "4";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }

    public static void main(String[] args) {

        fakeInput();

        Scanner in = new Scanner(System.in);

        //ArrayList helps with the input here, but a more cost-effective construct can be used if necessary
        ArrayList<Integer> firstFourDigits = new ArrayList<>();
        firstFourDigits.add(in.nextInt());
        firstFourDigits.add(in.nextInt());
        firstFourDigits.add(in.nextInt());
        firstFourDigits.add(in.nextInt());
//length
        int R = in.nextInt();
//width
        int C = in.nextInt();
//let's initialise the matrix and fill in the first four quadronacci numbers, that will eventually help us complete it
        long[][] quadNumbers = new long[R][C];

        quadNumbers[0][0] = firstFourDigits.get(0);
        quadNumbers[0][1] = firstFourDigits.get(1);
        quadNumbers[0][2] = firstFourDigits.get(2);
        quadNumbers[0][3] = firstFourDigits.get(3);

//assuming there will be input data where our matrix has a single row, we just fill in that single row in a quadronacci manner
        if (R == 1){

            for (int Col = 4; Col < C; Col++) {

                quadNumbers[0][Col] = quadNumbers[0][Col-1] + quadNumbers[0][Col-2]+quadNumbers[0][Col-3] +quadNumbers[0][Col-4];

            }


        }

/*
assuming there will be input data where there are only four columns, the logic is mostly set in stone
we have to only change rows and fill in accordingly:
 - the first number is the addition of the whole previous row
 - the second number is the addition of the first number and the last three numbers from the previous row
 - the third number is the addition of the first and second number, and the last two numbers from the previous row
 - the fourth number is the addition of the first, second and third number, and the very last number from the previous row
*/
        else if(R > 1 && C == 4){

            for (int Row = 1; Row < R; Row++) {

                quadNumbers[Row][0] = quadNumbers[Row-1][0] + quadNumbers[Row-1][1] + quadNumbers[Row-1][2] + quadNumbers[Row-1][3];
                quadNumbers[Row][1] = quadNumbers[Row-1][1] + quadNumbers[Row-1][2] + quadNumbers[Row-1][3] + quadNumbers[Row][0];
                quadNumbers[Row][2] =  quadNumbers[Row-1][2] + quadNumbers[Row-1][3] + quadNumbers[Row][0] + quadNumbers[Row][1];
                quadNumbers[Row][3] =  quadNumbers[Row-1][3]+ quadNumbers[Row][0] + quadNumbers[Row][1] + quadNumbers[Row][2];


                }


        }

// this is the big one, as it encompasses all the rest of the cases, so a more complex logic is required
        //however, we can also borrow from the previous two "if" cases!
        else if (R > 1 && C > 4){

                for (int Col = 4; Col < C; Col++) {
/*
                    complete the whole first row after the first four digits have been statically set at the beginning
                    this starts from the fifth number (index 4) and continues on till the end of the row
                    (until the current index is equal to the originally outlined number of columns (int C))
                    */
                    quadNumbers[0][Col] = quadNumbers[0][Col-1] + quadNumbers[0][Col-2]+quadNumbers[0][Col-3] +quadNumbers[0][Col-4];

                }




            for (int Row = 1; Row < R; Row++) {
                    /*
                now that the whole first row is complete, we can start with all the rest
                first we fill in the first four digits at each new row, as they depend of the on the last four digits of the previous row
                 - the first number is the addition of the last four numbers of the previous row
                 - the second number is the addition of the last three numbers of the previous row and the first number from the current row
                 - the third number is the addition of the last two numbers from the previous row and the first two numbers from the current row
                 - the fourth number is the addition of the last number from the previous row and first three numbers from the current row
                */
                quadNumbers[Row][0] = quadNumbers[Row-1][C-1] + quadNumbers[Row-1][C-2] + quadNumbers[Row-1][C-3] + quadNumbers[Row-1][C-4];
                quadNumbers[Row][1] = quadNumbers[Row-1][C-1] + quadNumbers[Row-1][C-2] + quadNumbers[Row-1][C-3] + quadNumbers[Row][0];
                quadNumbers[Row][2] =  quadNumbers[Row-1][C-1] + quadNumbers[Row-1][C-2] + quadNumbers[Row][0] + quadNumbers[Row][1];
                quadNumbers[Row][3] =  quadNumbers[Row-1][C-1]+ quadNumbers[Row][0] + quadNumbers[Row][1] + quadNumbers[Row][2];


                // now that the first four numbers are filled in, we no longer have to deal with the previous row, so we complete the current row accordingly
                for (int Col = 4; Col < C ; Col++) {

                    quadNumbers[Row][Col] = quadNumbers[Row][Col-1] + quadNumbers[Row][Col-2]+quadNumbers[Row][Col-3] +quadNumbers[Row][Col-4];

                }

                }
                        }




// print the matrix with spaces between the numbers
        for (int Row = 0; Row < R ; Row++) {
            for (int Col = 0; Col < C ; Col++) {

                System.out.print(quadNumbers[Row][Col] + " ");



            }

            System.out.println();


        }


    }

}




    /*We all know the Fibonacci line, where each number is the sum of the previous two. Well, the Quadronacci line is almost the same, but uses the previous four numbers to calculate. In short, we can define that the n-th number of the line is:
        Copy

        Q n = Q n-1 + Q n-2 + Q n-3 + Q n-4

        Where Q \( n \) is the current Quadronacci number (n is the n-toot index Quadronacci number).

        The Quadronacci line can begin with any four integers, Positive or negative, and proceed according to the defined formula.

        On the other hand, the Quadronacci rectangle is something you might expect

        a rectangle (matrix) of numbers contained in Quadronacci The row. The height of the rectangle is the number of rows in the matrix The width - the number of columns.

        Let R be the number of rows, and C - the number of columns. Then the first row of The rectangle will contain the first C numbers in the row, the second row will Contains the following C numbers from the row, etc.

        Your task is to write a program that prints on the console Quadronacci rectangle given the first four numbers of the row, The number of rows and the number of columns in the matrix.
        Input

        Input data will be read from the console.

        The first four lines will contain the first four goals Numbers of the Quadronacci line - each number in a different order.

        The fifth row will contain the number R - the number of rows in the rectangle.

        The sixth row will contain the number C - the number of columns in the rectangle.

        The input data will always be valid in the format described. Not necessary Be explicitly checked.
        Output

        Output data will be printed on the console.

        The output must contain exactly R number of lines containing exactly C of Number of numbers - the row of Quadronacci, as between every two numbers you need To have exactly one space.
        Limits

        1 ≤ R ≤ 20.
        4 ≤ C ≤ 20.
        Each row number can be compiled into a 64-bit integer type.

        Sample tests
        Input 	Output
        1
        2
        3
        4
        2
        8 	1 2 3 4 10 19 36 69
        134 258 497 958 1847 3560 6862 13227
        5
        -5
        1
        2
        3
        4 	5 -5 1 2
        3 1 7 13
        24 45 89 171
*/


















      /*  ArrayList<Integer> everyNextRow = new ArrayList<>();
         everyNextRow.add(in.nextInt());
        everyNextRow.add(in.nextInt());
        everyNextRow.add(in.nextInt());
        everyNextRow.add(in.nextInt());

        int R = in.nextInt();

        int C = in.nextInt();


        for (int i = 4; i < C ; i++) {

            everyNextRow.add(everyNextRow.get(i-4)+ everyNextRow.get(i-3) + everyNextRow.get(i-2)+ everyNextRow.get(i-1));


        }

ArrayList<Integer> everyPreviousRow = new ArrayList<>();
        everyPreviousRow.addAll(everyNextRow);


        ArrayList<ArrayList<Integer>> quadNumbers = new ArrayList<>();

        quadNumbers.add(everyNextRow);

        for (int i = 1; i < R; i++) {

            quadNumbers.add(everyNextRow);
            everyNextRow.clear();

            if(C>4){





            }

        }


*/



