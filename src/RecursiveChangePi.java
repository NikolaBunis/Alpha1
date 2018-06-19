//again taking advantage of string.contains and string.replace
// this problem would be much more efficient without the recursive calls, but .replaceAll might also contain recursion, but I'm too afraid to look inside it

public class RecursiveChangePi {

    public static void main(String[] args) {


        String str = "pip";

        System.out.println(changePi(str));

    }


    static String changePi(String str) {

        if (str.contains("pi")) {

            if (str.equals("pi")) {
                return "3.14";
            }

            if (str.length() < 2) {
                return str;
            }

            if (str.substring(str.length() - 2, str.length()).equals("pi")) {

                str = str.replace("pi", "3.14");

                return changePi(str);


            } else {
                return changePi(str.substring(0, str.length()-1)) + str.charAt(str.length()-1);
            }


        }

        return str;

    }

}


    /*Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

        changePi("xpix") → "x3.14x"
        changePi("pipi") → "3.143.14"
        changePi("pip") → "3.14p"*/
