import java.util.Scanner;

public class Bounce {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        int N = in.nextInt();

        int M = in.nextInt();

        int[][] matrix = new int[N][M];

        matrix[0][0] = 1;

        for (int i = 1; i < N ; i++) {
            matrix[i][0] = matrix[i-1][0] * 2;
        }

        for (int i = 0; i < N ; i++) {
            for (int j = 1; j < M ; j++) {

                matrix[i][j] = matrix[i][j-1] *2;

            }
        }

        int sum = matrix[0][0];

        int currentRow = 0;
        int currentCol = 0;


         while(currentCol == currentRow){

             currentRow++;
             currentCol++;






         }










    }


}
