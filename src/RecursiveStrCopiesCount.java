/*Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

        strCopies("catcowcat", "cat", 2) → true
        strCopies("catcowcat", "cow", 2) → false
        strCopies("catcowcat", "cow", 1) → true*/

public class RecursiveStrCopiesCount {

    public static void main (String[] args) {

        String str = "catcowcat";

        String sub = "cow";

        int N = 1;

        System.out.println(strCopies(str, sub, N));

    }

    static boolean strCopies(String str, String sub, int n) {

        if (str.length() == sub.length()) {

            if (str.equals(sub) && n == 1) return true;

            else return false;

        }

         //ref. 2
        if (n==0){

            if (str.length() < sub.length()) return true;

            if (str.contains(sub)) return false;

            if (!str.contains(sub)) return true;

        }




        if (str.substring(str.length() - sub.length()).equals(sub)) {
                                                                  //ref. 1
            return strCopies(str.substring(0, str.length() - 1), sub, n -1);
        }
        if (!str.substring(str.length() - sub.length()).equals(sub)) {

            return strCopies(str.substring(0, str.length() - 1), sub, n);

        }


        return false;




    }




}

/* The thing to remember from this one is that if you need to count with a given number in the method signature,
just decrement it on each recursive call that returns true:

If you find that "catcowcat" contains "cat" at any point, reduce the string by one and decrement the target count by one.

This way if the given string contains the given substring the given number of times("catcowcat", "cat", 2), the recursive
method will return true. If the counter reaches zero, but there are more instances of the substring:
("catcowcatcowcat", "cat", 2) -> the method will return false.

I had trouble with the bottom as well, as I copied a lot of code from the previous solution on CodingBat, but when I realised
that the most important(or the only, in fact) base case is when the number n is equal to zero, I modified the logic and
solved the problem with all possible test cases.

Main points with references to the code above:

- If you're given the number of times to find something in the signature of the method,
decrement the counter in the next recursive call on each successful find - "//ref. 1"


- Set the base case carefully around the counter being equal to 0(in this case the integer n) - "//ref. 2"

 */