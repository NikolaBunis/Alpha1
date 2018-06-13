//let's use some built in methods and let better people do the math for us

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumAvarage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        double[] numbers = new double[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextDouble();
        }

        /*Arrays.sort (numbers);*/

        double min = Arrays.stream(numbers).min().getAsDouble();
        double max = Arrays.stream(numbers).max().getAsDouble();
        double sum = Arrays.stream(numbers).sum();
        double avg = Arrays.stream(numbers).average().getAsDouble();
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("min=" + numberFormat.format(min));
        System.out.println("max=" + numberFormat.format(max));
        System.out.println("sum=" + numberFormat.format(sum));
        System.out.println("avg=" + numberFormat.format(avg));


    }
}

/* other approach

IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();

stats.getAverage()


 */



    /*Write a program that reads from the console a sequence of N real numbers and returns the minimal, the maximal number, the sum and the average of all numbers (displayed with 2 digits after the decimal point).

        The input starts by the number N (alone in a line) followed by N lines, each holding an real number.
        The output is like in the examples below.

        Input

        On the first line, you will receive the number N.
        On each of the next N lines, you will receive a single real number.

        Output

        You output must always consist of exactly 4 lines - the minimal element on the first line, the maximal on the second, the sum on the third and the average on the fourth, in the following format:

        Copy

        min=3.00
        max=6.00
        sum=9.00
        avg=4.50

        Constraints

        1 <= N <= 1000
        All numbers will be valid integer numbers that will be in the range [-10000, 10000]
        Time limit: 0.1s
        Memory limit: 16MB

        Sample tests
        Input 	Output
        3
        2
        5
        1 	min=1.00
        max=5.00
        sum=8.00
        avg=2.67
        3
        2
        -1
        4 	min=-1.00
        max=4.00
        sum=5.00
        avg=1.67*/