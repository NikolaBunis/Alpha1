import java.util.Scanner;

public class RecursiveNumbersToN {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        printNumber(N);


    }


    static int printNumber(int number){


        if (number == 1){


            System.out.print(number + " ");
            return number;
        }


       printNumber(number - 1);

        System.out.print(number + " ");

return number;






    }



}
