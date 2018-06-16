// fuck me sideways, this took half an hour of debugging to understand

public class RecursiveBunnyEars {

    public static void main (String[] args){


        int N = 6;

        System.out.println(bunnyEars(N));


    }



    static int bunnyEars(int bunnies) {
int NminusONE = bunnies;
        if(bunnies == 0){

            int result = 0;
            System.out.println("fun ( bunnies -1 ) = " + NminusONE + " and returns result " + result + " to the function above");
            return result;
        }



        int result =  2 + bunnyEars(bunnies - 1);
        System.out.println("fun ( bunnies -1 ) = " + NminusONE + " and returns result " + result + " to the function above");
return result;


    }
}
