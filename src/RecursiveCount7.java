/*
The trick to this is that, for a long time, I thought  "in order to produce a count number,
I need to increment a variable inside the function each time the function executes under the selected conditions (in this case if the digit we observe is equal to 7),
and not increment it when the conditions are not met, but still execute the next function below".

The problem with this is that the approach is taken right out of the way of thinking with loops and it does not work with recursion,
because the counter variable needs to be initialised... if it is, you usually do it by saying "int counter = 0;", but that, again,
does not work at all in recursion, because on each function call, the counter resets to 0 and can eventually be either 0 or 1,
regardless of what else you do inside your recursive function.

(because you either get 1 count if the number has one or more digits equal to the target(7) or you get 0 count if the number has no digits equal to the target)

So I immediately started thinking  - what if I create a static variable outside the method and increment each time the conditions are met?

While this is technically possible and could actually be useful, especially if the variable is an array construct of some sort,
the way CodingBat, the website that this problem originates from, want you to produce results is by returning an integer from the method itself(i.e. the code below).

Okay, so far so good, I had an idea, it didn't work, but the problem is still simple enough and I know what my recursive calls need to be.
I need to dig into each digit of the given number, starting right and going all the way to the leftmost digit. So my recursion must check
n % 10 and then call itself for n / 10. Simple enough, right? No.

Next thought - I remember this I've seen other people do it, the function should return 0 or 1 and then call itself for the next number (n /10) until it reaches the bottom,
where I'll just say "if the number is smaller than 10 and equal to 7, return 1, if the number is smaller than 10 and different from 7, return 0",
It took me some time and desperate attempts at trial and error to realise this will again return either 0 or 1 and nothing else. In most cases,
I didn't even go past checking the rightmost digit of the given number, because I couldn't figure out how to include the recursive call within the initial check.

And then it hit me! The return type of the method is "int", so I build the needed checks with "if" statements and just said:

return 1 + next recursive call(fun(n /10)) or return 0 + next recursive call(fun(n /10)), depending on if the current n % 10 equals the target(7).

Which will always return 0 or 1, but, when going from the base case up, will eventually increment to the desired counter.

Okay, this now work, right...? No.

The last piece was given to me by the IDE... I had return statements at the bottom and at the if-checks, but the method is syntactically incorrect,
until you put in the final return statement. I had no idea what that should be, my logic was at the if-checks and at the bottom. I tried putting in
"return null", but this is invalid, because my return type is "int". Then the IDE suggested "you would be better off if you return n".

How the fuck would that help? Would that not simply return the actual number itself? No. Because you can never actually reach that statement.
It appears to be a placeholder. If you never meet any of the conditions inside the function, it would return the initial value you've given it.
But that it virtually impossible, even if the integer is negative, it will still reach the bottom case where it's smaller than 10.

I may be mistaken in this interpretation, but it works for me for the time being and most importantly - my code works and I know why and how... mostly :)

SUMMARY:

If you need to produce a count of something, make your conditions return 1 or 0 added to the recursive call of the function below.
And set your bottom to return 1/0 or only 0, if need be.

THE ABOVE IS A NOTE TO MYSELF :D


 */

public class RecursiveCount7 {

    public static void main(String[] args) {

//hardcode a number taken from the problem's example cases for convenience
        int N = 717;
//call the method
        System.out.println(count7(N));

    }

    static int count7(int n) {

//the bottom returns either 0 or 1, so it can work for single digit numbers and return 0 or 1 to be added, when you start going up in the recursive calls
        if (n < 10) {

            if (n == 7) {
                return 1;
            } else {
                return 0;
            }

        }

//setting a condition that cannot be false, but without that I can't go into the logic below and my final return statement is invalid (IDE says non-reachable)
        if (n > 9) {
            if (n % 10 == 7) {
//increment if the digit is equal to the target(7)
                return 1 + count7(n / 10);


            } else {
                //don't increment, but still add the zero result to the next(and previous) recursive call
                return count7(n / 10); //simplified by the IDE, use to be "0 + return count7(n / 10);"

            }


        }

//there maybe a better way to express this logic than putting in an always true if-statement and a final return that can never be reached,
        //but I am neither aware of it, nor have the capacity(experience and braveness) to find what it is right now
        return n;
    }
}


    /*Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        count7(717) → 2
        count7(7) → 1
        count7(123) → 0*/