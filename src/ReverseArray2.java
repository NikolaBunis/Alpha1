/* this is the in-class solution, not my own

 */


import java.util.Scanner;

public class ReverseArray2 {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);


        String[] array = in.nextLine().split(" ");
// remember the .split method for handling rows of symbols/numbers!!!

        for (int i = array.length-1; i > 0; i --){

            System.out.print(array[i] + ", ");

        }
        System.out.print(array[0]);
// cheating with the the index 0 box, as I cannot remember the "trim" trick and printing array[0] + ", " generates and error in Judge
    }

}
