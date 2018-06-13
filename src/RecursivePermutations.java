import java.util.Collections;
import java.util.HashSet;

public class RecursivePermutations {

    static HashSet<String> numbers = new HashSet<>();

    public static void main (String[] args){

        int N = 3;
int M = 1;
        String startingString = "";

        permsToN(N, M, startingString);

        numbers.forEach(System.out::println);


    }


// I want to return a HashSet of lists
    static HashSet<String> permsToN (int N, int M, String numbersSet){

        HashSet<String> numbers = new HashSet<>();



if (M == N){

    numbers.add(numbersSet);

    return numbers;


}




        HashSet<String> currentNumbers = permsToN(N, M +1 ,numbersSet + String.valueOf(M));
numbers.addAll(currentNumbers);





return numbers;


    }







}
