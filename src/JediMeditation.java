import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JediMeditation {


    private static void fakeInput() {
        String test =
                "7\n" +
                "P4 P2 P3 M1 K2 P1 K1";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }

static ArrayList<String> jedi = new ArrayList<>();

    public static void main (String[] args){

        //fakeInput();

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();

        String[] input = in.nextLine().split(" ");


addMasters(input);
addKnights(input);
addPadawans(input);

        for (int i = 0; i < jedi.size() ; i++) {

            System.out.print(jedi.get(i)+ " ");

        }







    }


    static void addMasters (String[] allJedi){

        for (int i = 0; i < allJedi.length ; i++) {

            if(allJedi[i].charAt(0) == 'M'){

                jedi.add(allJedi[i]);

            }

        }


    }

    static void addKnights (String[] allJedi){

        for (int i = 0; i < allJedi.length ; i++) {

            if(allJedi[i].charAt(0) == 'K'){

                jedi.add(allJedi[i]);

            }

        }


    }

    static void addPadawans (String[] allJedi){

        for (int i = 0; i < allJedi.length ; i++) {

            if(allJedi[i].charAt(0) == 'P'){

                jedi.add(allJedi[i]);

            }

        }


    }


    }


   /* A long time ago, in a galaxy far, far away...

            All jedi must mediate. Yet, when the Jedi are at their temple, they cannot mediate at the same time, because the Force will become too much at one place and implosion will occur. There is a strict order for meditations: Jedi Masters mediate first, then Jedi Knights, and last are the padawans.

            Given the sequence of Jedi:

            P, K, M, M, K, P

            they will mediate in the following order:

            M, M, K, K, P, P

            given that M means a Jedi Master, K is a Jedi Knight, and P is a padawan.

            Joro and Gosho are padawans. They want to have as much time with the Force as they can. Given that, they do not want to wait meaninglessly for mediation. That is why, you can help them to solve in which order all Jedi will mediate.
            Input

            Use the standard input
            On the first line you will find the number N - the number of jedi, waiting for meditation
            On the second line you will fin exactly N jedi, waiting for meditation:
            M means jedi master
            K means jedi knight
            P means jedi padawan

            Output

            Use the standard output
            On the only line, print the correct sequence of jedi, ready for meditation
            Print each jedi's name
            Different jedi's are separated by a single space

            Constraints

            0 < N < 100 000

        Sample Tests
        Input
        Copy

        3
        M1 K1 P1

        Output
        Copy

        M1 K1 P1

        Description

        The sequence does not change, because they are already in the correct order
        Input
        Copy

        7
        P4 P2 P3 M1 K2 P1 K1

        Output
        Copy

        M1 K2 K1 P4 P2 P3 P1

        Description

        M1 meditates before all padawans and jedi knights
        K2 meditates before all padawans and after M1
        K1 meditates before all padawans and after K2
        The padawans mediate in the order they appear
*/
