//another exercise on searching a string for a target substring and showing a counter
//this time the substring is more than one character, but the .substring method delivers again
//it only took some fiddling with the integer values of substring indexes



public class RecursiveCountHi {
    public static void main (String[] args){


        String str = "xhixhix";


        System.out.println(countHi(str));




    }


   static int countHi(String str) {
int length = str.length();
        if (str == "hi"){

            return 1;

        }

        if (str.length() < 2){
            return 0;

        }

        if(str.substring(length-2, length).equals("hi")){

            return 1 + countHi(str.substring(0, length-1));


        }

       if(!str.substring(length - 2, length).equals("hi")){

           return countHi(str.substring(0, length - 1));

       }


       return 0;

    }


}
    /*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

        countHi("xxhixx") → 1
        countHi("xhixhix") → 2
        countHi("hi") → 1*/