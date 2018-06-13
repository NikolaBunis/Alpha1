import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RecursiveBracketCombinations {

    static HashSet<String> brackets = new HashSet<>();
    public static void main (String[] args){

        int N = 6;
        String bracketRow = "";

        brackets = bracketCombos(N, bracketRow);

        brackets.forEach(System.out::println);


    }



    static HashSet<String> bracketCombos(int N, String bracketRow){

        HashSet<String> brackets = new HashSet<>();


if (bracketRow.length() >= N){

    brackets.add(bracketRow);
    return brackets;
}


HashSet<String> currentBrackets = bracketCombos(N, bracketRow + "()");
brackets.addAll(currentBrackets);

currentBrackets = bracketCombos(N, "(" + bracketRow + ")");
        brackets.addAll(currentBrackets);

        currentBrackets = bracketCombos(N, "()" + bracketRow);
        brackets.addAll(currentBrackets);



        return brackets;




    }




}
