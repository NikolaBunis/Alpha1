//using the substring method, I could relatively easily search through a a string recursively



public class RecursiveCountX {

    public static void main (String[] args){

        String str = "hi";

        System.out.println(countX(str));



    }


    static int countX(String str) {

        if(str == ""){
            return 0;
        }

        if (str.length() == 1){

            if (str.charAt(0) =='x'){

                return 1;

            }
else { return 0;}


}


if (str.charAt(str.length()-1) == 'x'){

            return 1 + countX(str.substring(0, str.length()-1));

            }

            if (str.charAt(str.length()-1) != 'x'){
            return countX(str.substring(0, str.length()-1));
            }




return 1;








    }


}
