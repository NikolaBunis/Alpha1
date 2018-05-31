import java.util.*;

public class ReverseArray {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);


        List <Integer> ReverseNumbers = new ArrayList<>();
//to add to the end result dynamically

        String numbers = in.nextLine();
// to better read from the standard input


        char[] toCharArray = numbers.toCharArray();

        for (int i = toCharArray.length -1; i > -1; i--){

            if (toCharArray[i] != ' '){

                ReverseNumbers.add(toCharArray[i] - '0');
//char array to then add the values into an ArrayList
            }

        }

        for (int number = 0; number < ReverseNumbers.size()-1; number++) {

            int currentNumber = ReverseNumbers.get(number);

            System.out.printf(currentNumber + ", ");
        }


        System.out.print(ReverseNumbers.get(ReverseNumbers.size()-1));


    }


}

//seems too complicated, but I cannot handle the input in an adequate way

//there is not condition to actually reverse the array, just to print the numbers in reverse order