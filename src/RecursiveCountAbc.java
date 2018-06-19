/*Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

        countAbc("abc") → 1
        countAbc("abcxxabc") → 2
        countAbc("abaxxaba") → 2*/


public class RecursiveCountAbc {

    public static void main (String[] args){

        String str = "ababc";

        System.out.println(countAbc(str));

    }


    static int countAbc(String str) {

        if (str.length() < 3){
            return 0;
        }

        if(str.length() == 3){

            if(str.equals("abc")||str.equals("aba")){
                return 1;
            }
            else return 0;
        }


        if (str.substring(0, 3).equals("abc")||str.substring(0, 3).equals("aba")){
//ref. 1
            return 1 + countAbc(str.substring(2, str.length()));
        }

        if (!str.substring(0, 3).equals("abc")||!str.substring(0, 3).equals("aba")){

            return countAbc(str.substring(1, str.length()));
        }

        return 0;

    }



}

/* This problem taught me that it's not a good idea to skip characters when designing recursive calls.
For example, the function starts looking up "abc"/"aba" from left to right, if it finds a match, it
counts it and starts the next recursive call with substring(index3, end-of-string), effectively cutting out
all three characters.

The issue with this is that there are two possible substrings we're after - "abc" and "aba", where
the end character in one of them, matches the first character in both of them. Thus test cases such as
"ababc" or "ababa" should return count 2, not count 1, also "abababc" results in count 3, not 2, etc.

Looking back, the problems text never mentions that the two substrings cannot overlap,
so if something isn't directly outlined as impossible, we must assume it's possible and prepare for it.
(hopefully this teaches me to better sniff-out fringe cases out of vague problem texts :D)

So instead of cutting all three characters at the next recursive call, you cut one or two. Testing with
either one or two yielded the same result, but cutting 2 characters reduces the number of recursive calls,
which is always nice.

Check reference "//ref. 1" in the code.

 */
