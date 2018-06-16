import java.util.Scanner;

public class WildcardMatching {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        String s = in.nextLine();

        String p = in.nextLine();


        boolean comparisson = false;


if (p.contains("*") || p.contains("?")){



        }


else if (s.equals(p)){

    comparisson = true;
    System.out.println(comparisson);
}

else{
    comparisson = false;
    System.out.println(comparisson);
}





    }


    /*static boolean wildcardMatching(String s, String p) {


        StringBuilder String = new StringBuilder(s);

        StringBuilder Pattern = new StringBuilder(p);


        if (p.contains(*))







        }*/







    }




