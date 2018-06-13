import java.util.Scanner;

public class SpiralMatrix {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

int N = in.nextInt();

int[][] matrix = generateMatrix(N);

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {

                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }


    }


    static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int k=1;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;

        while(k<=n*n){
            for(int i=left; i<=right; i++){
                result[top][i]=k;
                k++;
            }
            top++;

            for(int i=top; i<=bottom; i++){
                result[i][right]=k;
                k++;
            }
            right--;

            for(int i=right; i>=left; i--){
                result[bottom][i]=k;
                k++;
            }
            bottom--;

            for(int i=bottom; i>=top; i--){
                result[i][left] = k;
                k++;
            }
            left++;
        }

        return result;
    }

}
