/*
This one was a bit tricky, especially since I decided to start from left to right, just to see if it works...
Well, it does, but some getting used to where str.length()-1 is was needed.
Anyway, remembering to clean up my own shit and
add removed characters at the end or at the start  of the string, depending if they're 'x' or not, did the trick again :)
*/


public class RecursiveEndX {

    public static void main (String[] args){

        String str = "xhixhix";

        System.out.println(endX(str));

    }




    static String endX(String str) {


        if (str.length() < 2){

            return str;
        }

        if(str.length() == 2){

            if (str.charAt(0) != 'x'){

                return str;

            }

            if ( str.charAt(0) == 'x' ){

                return "" + str.charAt(1) + str.charAt(0);
            }


            }


        if (str.charAt(0) == 'x'){

            return endX(str.substring(1, str.length())) + str.charAt(0);

        }

        if (str.charAt(0) != 'x'){

            return str.charAt(0) + endX(str.substring(1, str.length()));

        }


        return str;

    }




}


    /*Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

        endX("xxre") → "rexx"
        endX("xxhixx") → "hixxxx"
        endX("xhixhix") → "hihixxx"*/