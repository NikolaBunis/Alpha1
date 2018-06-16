/* In both bunny problems, the recursion simulates multiplication - it calls itself the number of times the initial number represents

If the number is 6, it calls itself six times and adds 2 on each call. (first bunny problem).
6 times 2... 6x2=12.

If the number is 6, but we have the problem below where every odd bunny has two ears, but every even bunny has three,
it calls itself 3 times for odd numbers and adds 2 and 3 times for even numbers and adds 3,
hence what it does is 3 times 2 added to 3 times 3... 3x2 + 3x3 = 6 + 9 = 15.


God damn rabbits!


 */


public class RecursiveBunnyEars2 {

    public static void main (String[] args){


        int N = 6;

        System.out.println(bunnyEars2(N));




    }


    static int bunnyEars2(int bunnies) {
        if(bunnies == 0){
            return 0;
        }

        int result = 0;
        if (bunnies % 2 != 0){
            result = 2 + bunnyEars2(bunnies - 1);
        }

        if (bunnies % 2 == 0){

            result = 3 + bunnyEars2(bunnies -1);
        }

        return result;

    }

}

    /*We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        bunnyEars2(0) → 0
        bunnyEars2(1) → 2
        bunnyEars2(2) → 5*/