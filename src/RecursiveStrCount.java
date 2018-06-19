/*Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

        strCount("catcowcat", "cat") → 2
        strCount("catcowcat", "cow") → 1
        strCount("catcowcat", "dog") → 0*/


public class RecursiveStrCount {

    public static void main(String[] args) {

        String str = "iiiijj";
        String sub = "i";

        System.out.println(strCount(str, sub));

    }


    static int strCount(String str, String sub) {

        if (str.length() == sub.length()) {

            if (str.equals(sub)) return 1;

            else return 0;

        }

        if (str.length() < sub.length()) return 0;


        if (str.substring(str.length() - sub.length()).equals(sub)) {
            //ref. 1
            if (str.substring(str.length() - sub.length() - 1, str.length() - 1).equals(sub) && sub.length() > 1) {
                return 1 + strCount(str.substring(0, str.length() - 2), sub);
            } else return 1 + strCount(str.substring(0, str.length() - 1), sub);
        }
        if (!str.substring(str.length() - sub.length()).equals(sub)) {

            return strCount(str.substring(0, str.length() - 1), sub);

        }


        return 0;


    }

}

/* A truly good one. I solved the main problem in half the time it took me to adjust the code to not count overlapping strings.
My desperate attempts to satisfy all test cases can be seen around the reference named "//ref. 1", noteworthy is my attempt at
being smart with index counting and doing stuff like (the length of the string minus the length of the substring) minus one...
And the cherry on top - my overlapping solution fixed everything, except for cases where the substring is a single character,
hence I had to add a final desperate push ->  "&& sub.length() > 1" added to one of the inner if-statements.

A deceptively easy-looking problem. Takeaways:

- READ THE FAKING MANUAL (problem text in this case)

- Start using variables for bullshit such as this: if (str.substring(str.length() - sub.length() - 1, str.length() - 1).equals(sub) && sub.length() > 1)

 */