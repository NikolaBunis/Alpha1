/*Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.

       count11("11abc11") → 2
       count11("abc11x11x11") → 3
       count11("111") → 1*/

public class RecursiveCount11inString {

    public static void main (String[] args) {
        String str = "111111";

        System.out.println(count11(str));

    }

    static int count11(String str) {

        if(str.length() < 2){

            return 0;
        }

        if(str.length() == 2){

            if (str.equals("11")){

                return 1;
            }

            if(!str.equals("11")){

                return 0;

            }

        }

//ref 1.
        if (str.substring(0, 2).equals("11")){

            if (str.charAt(2) == '1') {
                return 1 + count11(str.substring(2, str.length()));
            }

            if (str.charAt(2) != '1'){

                return 1 + count11(str.substring(1, str.length()));
            }

        }

        if(!str.substring(0, 2).equals("11")){

            return count11(str.substring(1, str.length()));


        }




        return 0;


    }





}


/* The trick to this one was to avoid overlapping elevens, such as "111" should return count 1, not 2.
And that's small enough to put at the bottom with the rest of the exceptions, but when you consider "11111" will return count 4 instead of 2,
that ruins a significant part of the test cases.


So here's the trickery I came up with:

If you encounter a substring "11", check the next character after that, so if it's in the beginning,
and index 0 plus index 1 make "11", check index 2, if that is equal to '1', skip it by snipping the next recursive call like this:

instead of 1 + fun(substring(1, end-of-string), call fun(substring(2, end-of-string), effectively snipping the third '1', thus
avoiding overlapping elevens.

Check the reference named "//ref 1." in the recursive method.

 */