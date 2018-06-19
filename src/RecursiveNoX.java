//string manipulation without .contains to help with the bottom.
//it turns out this "str = noX(str.substring(0, str.length()-1)) + str.charAt(str.length() -1);" is enough, paired with the .replace() method.



public class RecursiveNoX {


    public static void main (String[] args){

        String str = "xx";

        System.out.println(noX(str));


    }


    static String noX(String str) {

        if (str.equals("x")){

            return "";

        }

        if (str.equals("")){

            return str;

        }


        if(str.substring(str.length()-1, str.length()).equals("x")){

            str = str.replace("x", "");

            return str;

        }

        if(!str.substring(str.length() - 1, str.length()).equals("x")){

            str = noX(str.substring(0, str.length()-1)) + str.charAt(str.length() -1);

            return str;

        }






        return str;



    }





}

  /*  Given a string, compute recursively a new string where all the 'x' chars have been removed.

        noX("xaxb") → "ab"
        noX("abc") → "abc"
        noX("xx") → ""*/
