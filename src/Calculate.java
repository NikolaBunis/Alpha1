import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calculate {



    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//double data types, as calculations go bad otherwise
        double N = Double.parseDouble(reader.readLine());
        double x = Double.parseDouble(reader.readLine());



//the final formula begins with "1 +", so we add that statically to the calculating method
        double S = 1 + mainCalc(N, x);

// a little trick to print the desired format via th DecimalFormat class
        DecimalFormat numberFormat = new DecimalFormat("0.00000");
        System.out.println(numberFormat.format(S));






    }

//this method completes the expression from 1 to N  - 1!/x + 2!/x2 + … + N!/xN.
    static double mainCalc (double N, double x){


        double result = 0;
//the <= operator is important here, as simply "<" yields one expression less than needed
        for (int i = 1; i <= N; i++) {
//variables for easier tracking
long fact = factorialCalc(i);
double xPow = Math.pow(x,i);

            result += fact / xPow;




        }



return result;

    }





static long factorialCalc(double number){

        /*int result = 1;

    for (int i = 1; i <= number; i++) {

        result*= i;


    }*/
//recursive factorial, just because I can
    if (number == 0) {
        return 1;
    } else {
        return (long) (number * factorialCalc(number - 1));
    }






}


}


   /* Write a program that, for a given two numbers N and x, calculates the sum S = 1 + 1!/x + 2!/x2 + … + N!/xN.

        Use only one loop. Print the result with 5 digits after the decimal point.

        Input

        On the first line you will receive one number - N.
        On the second line you will receive another number - x.

        Output

        Output only one number - the sum of the sequence for the given N and x.

        Constraints

        N will always be a valid integer between 2 and 10, inclusive.
        X will always be a valid floating-point number between 0.5 and 100
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        3
        2 	2.75000
        4
        3 	2.07407
        5
        -4 	0.75781*/