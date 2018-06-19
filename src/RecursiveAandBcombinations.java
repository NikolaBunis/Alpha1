import java.util.*;

public class RecursiveAandBcombinations {

    static ArrayList<String> numberCombos = new ArrayList<>();

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String[] chars = in.nextLine().split(" ");

        generateCombos(N, N, chars , "");

Collections.sort(numberCombos);




        for (int i = 0; i <numberCombos.size() ; i++) {

            System.out.println(numberCombos.get(i));


        }



    }


    static void generateCombos(int length, int counter, String[] set, String numbers){


        if(counter == 0){

            numberCombos.add(numbers);
//recursion goes infinite without this return
            return;
        }


        for (int i = 0; i <set.length ; i++) {

            String currentNumbers = numbers + set[i];

            generateCombos(length, counter -1, set, currentNumbers);


        }









    }

}
