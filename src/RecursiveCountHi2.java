/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

        countHi2("ahixhi") → 1
        countHi2("ahibhi") → 2
        countHi2("xhixhi") → 0
*/


public class RecursiveCountHi2 {

    public static void main (String[] args){

        String str = "hixxhi";

        System.out.println(countHi2(str));


    }

    static int countHi2(String str) {

        if (str.length()< 2){
            return 0;
        }

        if (str.length() == 2){
            if(str.equals("hi")){
                return 1;
            }
            else return 0;
        }
        if (str.length() == 3){

            if (str.charAt(0)== 'x'){
                return 0;
            }
            else if (str.charAt(1) == 'h' && str.charAt(2) == 'i'){
                    return 1;
                }
                else if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
                    return 1;
                }

                else return 0;
            }

            if (str.charAt(0) == 'x'){

            if(str.charAt(1) != 'x') {

                return countHi2(str.substring(2, str.length()));
            }

            else return countHi2(str.substring(1, str.length()));
        }

        if (str.charAt(0) != 'x'){

            if (str.charAt(1) =='h' && str.charAt(2)== 'i'){
                return 1 + countHi2(str.substring(2, str.length()));
            }

            else if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){

                if (str.charAt(2) == 'h') {
                    return 1 + countHi2(str.substring(2, str.length()));
                }
                else if (str.charAt(2) != 'h'){
                    return 1 + countHi2(str.substring(1, str.length()));
                    }
            }


            else return countHi2(str.substring(1, str.length()));


        }


return 0;
    }

}

/* This one was harder than it seemed, I had to debug a lot and change the if-else logic multiple times, to
take care of different cases like "hi" at the beginning, double 'x' then "hi"... A lot of index adjustment and
additional logic was needed, especially to avoid overlapping of substrings, but at least I gained experience in debugging recursion.

This is problem number 25 out of 30 from CodingBat and I gained huge momentum, but I can see flaws in my code.
Particularly because I keep trying to complete the recursive method without fancy built in methods, like string.contains().
That one I used a few times, but then decided I want to learn things in a harder way and stopped using it, which resulted
in bigger method bodies, that, I am sure, can be improved upon by shortening and combining logical statements here and there.

That being said, I prefer to keep solving different problems to gain different types of experience, if it comes to optimisation,
I believe I can figure it out on the fly, after having solved the problem in principle, but it turns out my initial code is too slow.

At least I hope I can :D
 */
