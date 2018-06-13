import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {

    public static void fakeInput() {

        String input =
                "1 1 1 1 1"
                        ;

        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }


    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int[] numbers = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = solve(0,  numbers, 0, 3);

        System.out.println(result);

    }

    static int solve(int index, int[] numbers, int current, int target){

        if (index == numbers.length){

            if(current==target){
                return 1;
            }
            return 0;
        }


        int counter = 0;

        counter += solve(index +1, numbers, current + numbers[index], target);

        counter += solve(index +1, numbers, current - numbers[index], target);

return counter;



    }

}


    /*You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

        Find out how many ways to assign symbols to make sum of integers equal to target S.

        Example 1:

        Input: nums is [1, 1, 1, 1, 1], S is 3.
        Output: 5
        Explanation:

        -1+1+1+1+1 = 3
        +1-1+1+1+1 = 3
        +1+1-1+1+1 = 3
        +1+1+1-1+1 = 3
        +1+1+1+1-1 = 3

        There are 5 ways to assign symbols to make the sum of nums be target 3.

        Note:

        The length of the given array is positive and will not exceed 20.
        The sum of elements in the given array will not exceed 1000.
        Your output answer is guaranteed to be fitted in a 32-bit integer.
*/