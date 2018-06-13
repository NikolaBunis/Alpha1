import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LargestAreaInMatrix {


    private static void fakeInput() {
        String test = "5 6\n" +
                "1 3 2 2 2 4\n" +
                "3 3 3 2 4 4\n" +
                "4 3 1 2 3 3\n" +
                "4 3 1 3 3 1\n" +
                "4 3 3 3 1 1";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }


    public static void main (String[] args){

fakeInput();

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
in.nextLine();
        int[][] numbers = new int[N][M];

        for (int row = 0; row < N ; row++) {
String[] currentRow = in.nextLine().split(" ");
            for (int col = 0; col < currentRow.length ; col++) {
                numbers[row][col] = Integer.valueOf(currentRow[col]);
                }
            }


     /*   for (int row = 0; row < N ; row++) {
            for (int col = 0; col < M; col++) {

                System.out.print(numbers[row][col] + " ");

            }
            System.out.println();
        }
*/
     }



    /* static int determineLargestMatrixArea (int row, int col, int[][] matrix) {

         int counter = 1;

         if ((col < 0) || (row < 0) || (col >= matrix[0].length) || (row >= matrix.length)) {

             return counter;

         }

         if(matrix[]    )  }
*/




     }












   /* Write a program that finds the largest area of equal neighbour elements in a rectangular matrix and prints its size.
        Input

        On the first line you will receive the numbers N and M separated by a single space
        On the next N lines there will be M numbers separated with spaces - the elements of the matrix

        Output

        Print the size of the largest area of equal neighbour elements

        Constraints

        3 <= N, M <= 1024
        Time limit: 0.35s
        Memory limit: 24MB

        Sample tests
        Input 	Output
        5 6
        1 3 2 2 2 4
        3 3 3 2 4 4
        4 3 1 2 3 3
        4 3 1 3 3 1
        4 3 3 3 1 1 	13

        _Hint: you can use the algorithm Depth-first search or Breadth-first search._
*/