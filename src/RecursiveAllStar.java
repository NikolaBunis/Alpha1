public class RecursiveAllStar {

    public static void main (String[] args){

        String str = "hello";


        System.out.println(allStar(str));

    }

    static String allStar(String str) {

       /* StringBuilder builder = new StringBuilder(str);*/

if (str.equals("")){

    return "";

}

if (str.length() < 2){

    return str;
}


return allStar(str.substring(0, str.length()-1)) + "*" + str.charAt(str.length()-1);




    }





}

/*
    Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

        allStar("hello") → "h*e*l*l*o"
        allStar("abc") → "a*b*c"
        allStar("ab") → "a*b"*/
