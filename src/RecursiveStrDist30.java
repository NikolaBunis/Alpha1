/*Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.

        strDist("catcowcat", "cat") → 9
        strDist("catcowcat", "cow") → 3
        strDist("cccatcowcatxx", "cat") → 9

        */




public class RecursiveStrDist30 {

    public static void main (String[] args){

        String str = "hiHellohihihi";
        String sub = "ll";


        System.out.println(strDist(str, sub));


    }

    static int strDist(String str, String sub) {


        int stringLength = str.length();
        int substringLength = sub.length();


        if(!str.contains(sub)) return 0;

        if (stringLength < substringLength) return 0;

        if (str.equals(sub)) return stringLength;

        if(str.substring(0, substringLength).equals(sub) && str.substring(stringLength - substringLength).equals(sub)){
            return stringLength;
        }

        //ref. 1
        if(!str.substring(0, substringLength).equals(sub)){

            if (str.substring(stringLength - substringLength).equals(sub))

            return strDist(str.substring(1,stringLength), sub);

            if(!str.substring(stringLength - substringLength).equals(sub)){

                return strDist(str.substring(1, stringLength-1), sub);

            }

        }

//ref. 2
        if(str.substring(0, substringLength).equals(sub)){

            if(!str.substring(stringLength - substringLength).equals(sub)){

                return strDist(str.substring(0, stringLength-1), sub);

            }

        }




return stringLength;

    }



}

/*
This one was a bit tricky as well, because you need to cut from both sides, but stop at a certain point.
I nailed down the logic to cut from both sides and stop when the sub string is found on the leftmost part of the string:
check the if-construct at "//ref. 1". but I got a wrong answer for the string "hiHellohihihi" and sub "ll", because
my recursive calls practically ended when I'm finished on the left, regardless if I'm finished on the right.

Another patchwork attempt to cover all test cases is the if-construct at "//ref. 2" - it allows the method to continue
cutting on the right while staying put on the left until it gets you the target result.

I'm absolutely sure that the logic is again too complicated and there are duplicate if-else elements (in fact, looking back
I have not put in a single else-statement :D), but I'm too tired to think about optimisation at this point. :(
(this is the final, 30th, problem from the Recursion warm-up course at CodingBat:

http://codingbat.com/java/Recursion-1

*/
