import java.util.Scanner;

public class SymetricArrays {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
// this moves the marker to the next lines, as .nextInt() does not

        for (int i = 1; i <= N; i++){
// we only need to examine every line as an array once,
//hence we cycle through the lines once and do our job inside this for loop
            String[] array = in.nextLine().split(" ");
// when in doubt, use the .split() method
            boolean isSymmetric = true;
            //a flag for good measure

int length = array.length;
// a variable for cleaner looking syntax, the below math trick is where it comes in handy


            for (int j = 0; j < length/2; j++){
                //traversing the array at hand itself, but only up to its center/halfway point
if (array[j].equals (array[length - 1 - j])){
//comparing the value of the first index with the value ot the last index
    //via this formula, you can compare indexes one step at a time, taking both counterparts at each end

    isSymmetric = true;
    //flag stays true
}
else { isSymmetric = false;
//if not - we break the loop and continue onto the next row of numbers (examining them as an array)
break;}



            }

            System.out.println(isSymmetric ? "Yes" : "No");
            // remember this system out trick when you use flags!!!

            }



    }
}


/*

An symmetric array is an array, where the elements are equal at indices:

    0 and len - 1
    1 and len - 2
    2 and len - 3
    3 and len - 4
    etc..

You are given some arrays of numbers.

Check if they are symmetric.
Input

Read from the standard input

    On the first line, read the number N
        The number of arrays to follow
    On the N lines, read the elements of each array
        Separated by a white space

Output

Print to the standard output

    For each of the arrays, print "Yes" or "No"

Sample tests
Input
Copy

4
1 2 3 2 1
2 1
1 2 2 1
4

Output
Copy

Yes
No
Yes
Yes



 */