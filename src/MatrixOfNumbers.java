import java.util.Scanner;

public class MatrixOfNumbers {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        int N = in.nextInt();


        int[][] matrix = new int[N][N];

        matrix[0][0] = 1;

        for (int i = 1; i < matrix.length ; i++) {

            matrix[i][0] = matrix[i-1][0] + 1;
         //   System.out.println(matrix[i][0]);
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 1; col < matrix.length; col++) {

                matrix[row][col] = matrix[row][col-1]+1;

               // System.out.print (matrix[row][col] + " ");

            }
          //  System.out.println();

        }


        for (int row = 0; row < matrix.length ; row++) {

            for (int col = 0; col < matrix.length ; col++) {

                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }

    }

}
