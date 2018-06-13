//old one I needed to fix


import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int [] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);
        int RepeatingNumber = 0;
        int BestRepeatingNumber = 0;
        int counter = 1;
        int MaxCounter = 1;

        for (int i = 1; i < numbers.length; i++){

            if (numbers[i] == numbers [i - 1]){

                counter++;

                RepeatingNumber = numbers[i];

                if (counter > MaxCounter){

                    MaxCounter = counter;
                    BestRepeatingNumber = RepeatingNumber;

                }



            }

            else {
                counter = 1;
                continue;

            }
        }
        System.out.println(BestRepeatingNumber + "(" + MaxCounter + " times)");
    }
}