//similar to count7, I could exercise generating counters with an additional twist - I needed to watch out for identical neighbouring digits
//I think I mostly did okay, but I could't, only from the problems text, grasp how 8818 should yield 4, unless 88 equals 3
//in the end I managed it with putting three + (next function call) and it worked except for one test case - 88888
//I get it to either 7 or 12, with any logic, regardless if I hard code "return 3" at the appropriate steps or if I try to say 2 times next function call...



public class RecursiveCount8 {

    public static void main (String [] args){

        int N = 88888;

        System.out.println(count8(N));


    }


    static int count8(int n) {
        if (n < 100) {

            if (n % 10 == 8 && (n /10) % 10 != 8) {
                return 1;
            }

            else if (n % 10 == 8 && (n /10) % 10 == 8){

            }

            else {
                return 0;
            }

        }

        /*if (n == 88){

            return 3;

        }*/


        if (n > 9) {
            if (n % 10 == 8 && (n / 10)% 10 == 8 ) {

                    return 3 + count8(n /10);
            }

            else if (n % 10 == 8 && (n / 10)% 10 != 8){

return 1 + count8((n /10)/10);


            }



            else {
                return 0 + count8(n / 10);

            }


        }


        return n;
    }



}

  /*  Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        count8(8) → 1
        count8(818) → 2
        count8(8818) → 4*/