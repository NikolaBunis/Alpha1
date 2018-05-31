import java.util.Scanner;

public class IfPrimeMethod {

    public static void main (String[] args){

Scanner in = new Scanner(System.in);

int N = in.nextInt();


if (PrimeCheck(N)){

    System.out.printf("The Number " + N +  " is prime");

}

else {

    System.out.println("The Number " + N +  " is not prime");
}



    }

    public static boolean PrimeCheck(int number){



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
