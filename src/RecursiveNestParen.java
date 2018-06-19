/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.

        nestParen("(())") → true
        nestParen("((()))") → true
        nestParen("(((x))") → false

*/


public class RecursiveNestParen {

    public static void main(String[] args) {

        String str = "(((x))";

        System.out.println(nestParen(str));

    }

    static boolean nestParen(String str) {

        if (str.equals("")) return true;


        if (str.length() % 2 != 0) {

            return false;
        }

        if (str.length() == 2) {

            if (str.equals("()")) return true;
            else return false;

        }


        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {

            return nestParen(str.substring(1, str.length() - 1));

        } else return false;


    }


}

/* This one worried me at first, because of the mild PTSD I developed from "easy" recursion problems I was presented with that included
bracket combinations. But the suggestion in the problem's text reached just the right spot in my mind and it came up with the exact idea needed.
So much so, that I forgot to put a bottom in, I went straight for the recursive calls logic. More to the point, we're looking for a easy to spot pattern:
((())) - > they're in order, not mixed: ()()(())((()))

The usual indexing problems with substrings aside, I really made most cases from the first try when I put an adequate bottom. The only one I failed
was the empty string test case. I thought that it was covered with this check - "str.length() % 2 != 0", but my poor math skills failed me yet again.
Then I thought, okay, I'll hard code it to false... but, it says "zero or more pairs" in the problem's text, so there we go - read the god damn text!


 */