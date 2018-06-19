/*Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

        parenBit("xyz(abc)123") → "(abc)"
        parenBit("x(hello)") → "(hello)"
        parenBit("(xy)1") → "(xy)"*/


public class RecursiveParenBit {

    public static void main (String[] args){

        String str = "(xy)1";

        System.out.println(parenBit(str));


    }

    static String parenBit(String str) {

        if (str.length() < 3){
            return str;
        }

        if (str.length() == 3){

            if (str.charAt(0) != '('){

                return "" + str.charAt(1) + str.charAt(2);

            }

            if (str.charAt(0)=='('){

                if (str.charAt(2) != ')'){

                    return "" + str.charAt(0) + str.charAt(1);
                }

                else return str;

            }

        }


        if (str.charAt(0) != '('){

            return parenBit(str.substring(1, str.length()));

        }

        if (str.charAt(0) == '('){

            if (str.charAt(str.length()-1)!= ')'){
                return parenBit(str.substring(0, str.length()-1));
            }

            if (str.charAt(str.length()-1) == ')'){
                return str;
            }


        }




return str;


    }

}


/* This one was scary at the beginning, until I realised I should simply discard characters from index 0 until my first character is '('
and then discard characters from index string.length -1 until my last character is ')'. Going wild without the need to pick up after myself
at every recursive call - bring it one, I debugged a single time to take care of some indexing problems within the logic and I solved it.

This time, however, after submitting a working solution, CodingBat surprised me with their own example solution, which I haven't seen present
since the very first problems. I am applying the solution after this comment section. Here are my takeaways from it.

 - I don't have efficient command of the .substring method yet, it seems I've always strived to list both start and end indexes of the next
 substring. Something the CodingBat solution avoids when possible.

 - My logic seems too complicated, because I always list more conditions than necessary, mostly to follow my thoughts in code and to understand where to
 modify my code when debugging. I don't see it as a problem when you tackle a problem for the first time, it's like printing out interim variables
 amidst your code while debugging to make it even clearer, even if you look at your console results along side the debugger.

 - However, in the future, when I don't aim for as many problems solved, but aim for an efficient solution, I should optimise my code, exactly
 like I remove interim variable prints for final code submissions :)


 */


/* CodingBat solution:

public String parenBit(String str) {
  if (str.charAt(0) != '(') {
    return parenBit(str.substring(1));
  }
  if (str.charAt(str.length()-1) != ')') {
    return parenBit(str.substring(0, str.length()-1));
  }
  return str;

  // Solution notes: this is tricky. Is the first char a '('?
  // If not, recur, removing one char from the left of the string.
  // Eventually this gets us to '(' at the start of the string.
  // If the first char is '(', then recur similarly, removing one char from
  // the end of the string, until it is ')'.
  // Now the first and last chars are ( .. ) and you're done.
}
 */
