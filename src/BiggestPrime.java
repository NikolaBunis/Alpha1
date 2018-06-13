import java.util.Scanner;

public class BiggestPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(biggestPrimeToNumber(N));


    }

    // this method iterates the numbers between 1 and the given number and returns the greatest
    static int biggestPrimeToNumber(int number) {


        for (int i = number; i >= 1; i--) {

            if (primeCheck(i)) {
return i; }

        }
return 1;
    }

    public static boolean primeCheck(int number){



        int maxDivider = (int) Math.sqrt(number);
        int divider = 2;
        boolean primeCheck = true;


        while (primeCheck && (divider <= maxDivider)) {
            if (number % divider == 0) {
                primeCheck = false;
            }
            divider++;



        }
        if (primeCheck) {
            return true;
        }
        else {
            return false;
        }

    }



}






