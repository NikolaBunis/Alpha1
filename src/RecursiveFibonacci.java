import java.util.ArrayList;

public class RecursiveFibonacci {

    public static void main (String[] args) {



        System.out.println(fibonacciNumberAtPosition(10));


    }

    static int fibonacciNumberAtPosition (int number){

        if (number == 0){

    return 0;
        }

       else if (number ==1){
            return 1;

        }

        else{

    return fibonacciNumberAtPosition( number -1) + fibonacciNumberAtPosition(number - 2);

        }



    }





}
