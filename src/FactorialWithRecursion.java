import java.math.BigInteger;

public class FactorialWithRecursion {

    public static void main (String[] args){

        int N = 6;


        BigInteger BigN;
        BigN = new BigInteger(String.valueOf(30));

        System.out.println(recursiveFactPrimitive(N));

        System.out.println(recursiveFactorial(BigN));

    }



    static BigInteger recursiveFactorial (BigInteger number){

        if (number.intValue() <= 1){

return BigInteger.ONE;

        }

        return number.multiply(recursiveFactorial(number.subtract(BigInteger.ONE)));

            }




static int recursiveFactPrimitive (int number){

    if (number == 1 || number == 0){

        return 1;
    }

    return number * recursiveFactPrimitive(number -1);



}
}

