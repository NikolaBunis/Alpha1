
//a colleague's solution to this problem

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

    public class MinMaxSumAvg2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();

            int arr[] = fillArray(N);
            printMinAndMax(arr);
            printSumAndAverage(arr);

        }
        public static int[]  fillArray(int N){

            Scanner in = new Scanner(System.in);
            int arr[] = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            return arr;
        }
        public static void printMinAndMax(int arr[]){
            DecimalFormat df = new DecimalFormat("####0.00");
            int min = Arrays.stream(arr).min().getAsInt();
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println("min="+ df.format(min));
            System.out.println("max="+ df.format(max));
        }
        public static void printSumAndAverage(int arr[]){
            DecimalFormat df = new DecimalFormat("####0.00");
            int sum = 0;
            for(int i=0; i <arr.length ; i++){
                sum = sum + arr[i];
            }
            System.out.println("sum="+ df.format(sum));
            double sumdouble = (double)(sum);
            double length = arr.length;
            double average = sumdouble / length;
            System.out.println("avg="+df.format(average));


        }
    }


