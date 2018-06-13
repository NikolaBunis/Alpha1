public class RecursiveStringReverse {

    public static void main (String[] omg){

        String string = "Telerik";

        String output = reverseString(string);

        System.out.println(output);

    }


    static String reverseString(String string){

        if(string.length() == 0){

            return string;
        }


        return reverseString(string.substring(1)) + string.charAt(0);




    }







   /* static String reverseString (StringBuilder string){


        if ( string.equals("")){

            return reverseString(string);

        }

    StringBuilder string2 = new StringBuilder();

        string = string2.append(string.charAt(0));
        string = string.deleteCharAt(0);

return reverseString(string);

    }*/






}
