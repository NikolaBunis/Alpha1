import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsetOfSumS {

    private static void fakeInput() {

        String input =
                "14\n" +
                        "2 1 2 4 3 5 2 6" ;

        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }
    public static void main (String[] args){

     //  fakeInput();

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>(1);

        int S = in.nextInt();
        in.nextLine();

        String[] input = in.nextLine().split(" ");
       // System.out.println(input.length);
        for (int i = 0; i < input.length; i++) {
          //  System.out.print(input[i] + " ");


            numbers.add(Integer.parseInt(input[i]));
        }


      //  System.out.println();
       // System.out.println(numbers.size());











                if (HasSum(numbers, S)){

                    System.out.println("yes");
                }

                else if (!HasSum(numbers, S)){

                    System.out.println("no");
                }

        /*for (int i = 0; i < numbers.size(); i++) {

            System.out.print(numbers.get(i));

        }*/

        }

// this method takes and ArrayList and a sum, then checks those against a boolean table
// to determine if there is a subset within the list that equals the sum via dynamic programming
    static boolean HasSum (ArrayList<Integer> numbers, int sum){

        int length = numbers.size();

        boolean[][] table = new boolean[sum+1][length+1];

        int i = 0;
        //If sum is zero; empty subset always has a sum 0; hence true
        for( i = 0; i <= length; i++ )
            table[0][i] = true;

        //If set is empty; no way to find the subset with non zero sum; hence false
        for( i = 1; i <= sum; i++ )
            table[i][0] = false;

        //calculate the table entries in terms of previous values
        for( i = 1; i <= sum; i++ )
        {
            for( int j = 1; j <= length; j++ )
            {
                table[i][j] = table[i][j-1];

                if( !table[i][j] && i >= numbers.get(j-1) )
                    table[i][j] = table[i-numbers.get(j-1)][j-1];
            }
        }

        return table[sum][length];
    }





    }



