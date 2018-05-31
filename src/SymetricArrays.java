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
