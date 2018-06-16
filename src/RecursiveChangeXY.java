/*
Another recursive string manipulation, where, immediately I remembered the .replace() method for the String data type
However, this was not enough, it only covered the cases where there was 'x' in the String, but near the end, not in the middle
This resulted in a stack overflow like with this example - "yyhxyi" where the string would indefinitely dig down at the the first
two characters after the x was replaced and "yyhyyi" as there is no condition in the if-statement that deals with continuing left through the
whole string after replacing the target character(x).

This is where debugging came big for me, as I spotted that this line needs something more to it:
else{ return changeXY(str)} ; - just after the "replace" line, where x's become y's
I put it there with the intention of making the algorithm dig in after an 'x' has been replaced with a 'y', but left like that, it simply
caused an indefinite function call cycle, hence stack overflow.

So I decided to put in a condition to remove characters from right to left, if they are not 'x'. That worked, to an extent,
but resulted in an output where strings would get cut down in certain cases - "yyhy", instead of "yyhyyi" and that's when it hit me...
I don't know how it clicked, but I though - well I'm digging in recursively and each time I find a character useless (it is not an 'x'), I throw it away,
that's why my strings will always get cut off... so let's add the removed characters outside the method call:
return changeXY(str.substring(0, str.length()-1)) + str.charAt(str.length()-1);

And as I typed this in and tested it, the realisation came flooding in - all the examples I've seen and the principle that
you need to also find your way back up the recursion, while collecting your bread crumbs along the way, so you would get the initial product together.

Marvelous to have finally figured something out by myself.

Addendum: I also managed to figure out a bottom by cheating with the .contains() string method, so the bottom is actually ... at the bottom of the method's body :D

Note: the concatenation of regular strings can be optimised via StringBuilder, but I wanted to focus on the logic, not the efficiency this time

SUMMARY:

REMEMBER TO PICK YOUR SHIT UP WHEN YOU GO BACK UP THE RECURSIVE LADDER :D



*/


public class RecursiveChangeXY {


    public static void main (String[] args){

        String str = "yyhxyi";


        System.out.println(changeXY(str));
    }


    static String changeXY(String str) {


if (str.contains("x")){



    if(str.charAt(str.length()-1) == 'x'){

     str = str.replace(str.charAt(str.length()-1), 'y');

        return changeXY(str);

    }

    else{


        return changeXY(str.substring(0, str.length()-1)) + str.charAt(str.length()-1);

    }



}



else{ return str;}


    }




}


   /* Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

        changeXY("codex") → "codey"
        changeXY("xxhixx") → "yyhiyy"
        changeXY("xhixhix") → "yhiyhiy"*/