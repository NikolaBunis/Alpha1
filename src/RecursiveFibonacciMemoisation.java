import java.util.ArrayList;

public class RecursiveFibonacciMemoisation {



    static ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
    public static void main(String[] args) {
        initializeFibonacciNumbers();

        System.out.println(calculateFibonacci(6));
        System.out.println(fibonacciNumbers);
    }
    static int calculateFibonacci(int n) {
        if(n == 0) {
            return fibonacciNumbers.get(0);
        }
        else if(n == 1 || n == 2) {
            return fibonacciNumbers.get(1);
        }
        else {
            if(fibonacciNumbers.size() > n) {
                return fibonacciNumbers.get(n);
            } else {
                fibonacciNumbers.add(calculateFibonacci(n -1 ) + calculateFibonacci(n - 2));
          //      System.out.print((n-1)+ (n-2) + " ");
                return fibonacciNumbers.get(n);
            }
        }
    }


    private static void initializeFibonacciNumbers() {
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(1);
    }

}
