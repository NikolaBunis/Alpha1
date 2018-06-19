/*
more exercise on the "reverse string" principle - when manipulating string, make sure you re-add each character you removed on the way down
when you go back up... and add anything you need in addition, by concatenating it along with removed characters per the problems condition(s)
as in this one - if we have two adjacent equal characters, we add a "*" in between them by concatenating it between the right character
and the recursive call of the substring between the start of the original string and the left character:
hello -> hel + * + l + o
*/

public class RecursivePairStar {

    public static void main (String[] args)
    {

        String str = "aaaaaaaaaa";

        System.out.println(pairStar(str));

    }


    static String pairStar(String str) {


        if (str.length() < 2) {

            return str;
        }


        if (str.length() == 2){

            if(str.charAt(0) == str.charAt(1)){

                return str.charAt(0) + "*" + str.charAt(1);
            }

            if(str.charAt(0) != str.charAt(1)){

                return str;
            }


        }



if ( str.charAt(str.length()-1) == str.charAt(str.length()-2)){


    return pairStar(str.substring(0, str.length()-1)) + "*" + str.charAt(str.length()-1);

}

if (str.charAt(str.length()-1) != str.charAt(str.length()-2)){

    return pairStar(str.substring(0, str.length()-1)) + str.charAt(str.length()-1);
}

return str;

    }



}


    /*Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

        pairStar("hello") → "hel*lo"
        pairStar("xxyy") → "x*xy*y"
        pairStar("aaaa") → "a*a*a*a"*/