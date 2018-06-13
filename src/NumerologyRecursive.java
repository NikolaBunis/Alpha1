import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerologyRecursive {

//static array for storing the final results
    static int[] output = new int[10];

    private static void fakeInput() {
        String test = "18790314";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }


    public static void main(String[] args) {

       fakeInput();

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();
//String to get the initial number and then to add it to a list for manipulation
        for (int i = 0; i < input.length(); i++) {

            numbers.add(input.charAt(i) - '0');

        }


//calling the recursive method
           exploreAll(numbers);


//printing the final results from the static array
        for (int i = 0 ; i < output.length; i ++ ) {

            System.out.print(output[i] + " ");

        }



    }



//the recursive method, takes a list and does not return anything
    //it increments each of the elements of the "output" array per the returned result
// where the indexes of the array represent the numbers from 0 to 9
static void exploreAll (ArrayList<Integer> recursiveList){

//a few variables to make things easier to read
        int size = recursiveList.size();
        int currentNumberTransformation;
        int finalDigit = recursiveList.get(0);

    if (size == 1){

//this is the increment
        output[finalDigit]++;

        // apparently you don't need a return statement? :D return;


    }
// cycling through the list in order to check every possible number as a starting point
    // until the index is equal to the size minus one - in order not to make an iteration starting from the last digit - not needed and breaks the rest of the logic
    for (int i = 0; i < size-1; i++) {


        // more variables to improve code readability and to help with getting us back up the rabbit hole :D
        int firstDigit = recursiveList.get(i);
        int secondDigit = recursiveList.get(i + 1);


        //this three lines below compute the new number out of the first taken neighbouring numbers via the separate method
        // then add the new number and remove the "old" ones
        currentNumberTransformation = computeNumerologically(firstDigit,secondDigit);

        //.set replaces the old number with the new one
        recursiveList.set(i, currentNumberTransformation);
        recursiveList.remove(i + 1);

       // a used-to-be useful check System.out.println(recursiveList); - now useful only if you want to see how many recursive calls happen


        //the recursive call happens here, so the method can call itself on the now smaller list
        // original size is 8, this one digs in from size 7 down to 1(where it hits the bottom and starts going up)
        exploreAll(recursiveList);

        //as the removed numbers are stored in these two helpful variables,
        // they can now be re-added to the list, so the for-loop above (at each step, obviously) can check all of the possible variations
        //eventually testing every variation of the full list and every sub-list
        recursiveList.set(i, secondDigit);
        recursiveList.add(i, firstDigit);

    }



}

//a method for calculating two numbers with the formula outlined in the description
    //returns a single digit number to use in the rest of the algorithm
    static int computeNumerologically ( int a, int b){

        int result = (a + b) * (a ^ b) % 10;


        return result;
    }




}



   /* Pesho thinks that numerology is buggy. That is why he developed his own method of playing with the divine, suitable for programmers.

        Here is how to calculate your abilities.

        You start with a number (always a number) - your birthday in the format YYYYMMDD. Instead of summing the digits, do the following operations:

        Choose two neighbouring digits - a and b
        Perform the following operation: (a + b) * (a ^ b) % 10
        + is addition
        * is multiplication
        ^ is bitwise exclusive or (XOR)
        % is modulo division
        % 10 means get just the last digit
        Replace the chosen digits with the result
        You get an one-digit shorter number
        Repeat the process until you get only a single digit

        Pesho noticed that depending on your choices of digits you would get different results in the end. So he advises you to do each possible combination and count how many times you get 0, 1, ... 9.

        After you've done all the calculations you can look yourself up in the table:
        Digit 	Meaning
        0 	You are a very good programmer
        1 	You will create very useful programs
        2 	You are ugly
        3 	You will always depend on an IDE
        4 	You like strange languages
        5 	You loath science fiction
        6 	6? 6 is still a mystery to Pesho
        7 	You think class inheritance is magic
8 	You do not mind dynamic typing
        9 	You are going to be famous
        Input

        Input is read from the console
        An 8 digit number is read from the first input line

        Output

        Output should be printed on the console
        Print the 10 numbers on a single line
        separate them by spaces*/
