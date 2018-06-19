//I conducted another exercise on starting from left to right, as otherwise this problem would not have been challenging enough.
//Simply returning a counter without collecting discarded characters is now too easy.


public class RecursiveCountPairs {

    public static void main (String[] args){

        String str = "axbx";
        System.out.println(countPairs(str));

    }

    static int countPairs(String str) {

        if (str.length() < 3) {
            return 0;
        }

        if (str.length() == 3) {

            if (str.charAt(0) == str.charAt(2)) {

                return 1;
            } else return 0;
        }


        if (str.charAt(0) == str.charAt(2)){

            return 1 + countPairs(str.substring(1, str.length()));

        }

        if (str.charAt(0) != str.charAt(2)){

            return countPairs(str.substring(1, str.length()));

        }


//this is a placeholder...? check how this can be avoided
return 0;

    }


}



/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

        countPairs("axa") → 1
        countPairs("axax") → 2
        countPairs("axbx") → 1*/
