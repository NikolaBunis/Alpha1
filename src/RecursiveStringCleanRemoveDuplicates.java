/*Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

        stringClean("yyzzza") → "yza"
        stringClean("abbbcdd") → "abcd"
        stringClean("Hello") → "Helo"*/




public class RecursiveStringCleanRemoveDuplicates {

public static void main (String[] args){

    String str = "Hello";

    System.out.println(stringClean(str));

}

    static String stringClean(String str) {

if(str.length()<2){

    return str;

}

if (str.length()== 2){

    if (str.charAt(0) == str.charAt(1)){
        return ""+str.charAt(0);
    }

    if (str.charAt(0) != str.charAt(1)){
        return str;
    }

}


if (str.charAt(0) == str.charAt(1)){


    return stringClean(str.substring(1, str.length()));

}

if (str.charAt(0)!= str.charAt(1)){
    return str.charAt(0) + stringClean(str.substring(1, str.length()));
}




return str;



    }

}

/* This one was fairly straight forward, especially when you realise that, if you need to "clean" duplicate characters,
you essentially don't pick up leftovers from recursive calls, but simply discard them.

And when adjacent characters are not identical, it's vice versa - you make the recursive calls while picking up
the discarded character on your way up.
 */