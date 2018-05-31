import java.util.Scanner;

public class MainDiagonal2 {

    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        int N = in.nextInt();

        long array[][] = new long [N][N];

        array[0][0] = 1;


        for (int i = 1; i < N; i++){

            array[i][0] = array[i-1][0] * 2;

        }

        for (int i = 0; i < N; i++){

            for (int j = 1; j < N; j++){

                array[i][j] = array[i][j - 1] *2;
            }}

        long sum = 0;

        for (int i = 0; i < N; i++){

            for (int j = N-1; j >= i; j--) {

                sum += array[i][j];
/* This problem as almost the same as "MainDiagonal",
with the additional requirement that you include the main diagonal numbers to the sum
hence the condition in this for loop is j greater than or equal to i, not only greater than

j >= i VS j > i

 */





            }

        }

        System.out.println(sum);




    }



}
