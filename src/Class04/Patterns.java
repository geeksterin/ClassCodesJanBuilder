package Class04;

public class Patterns {

    public static void printStar(int noOfStars){

        for (int i=0;i<noOfStars;i++){
            System.out.print("*");
        }
        return;
    }

    public static void printSpace(int noOfSpace){

        for (int i=0;i<noOfSpace;i++){
            System.out.print(" ");
        }
        return;
    }


    public static void main(String[] args){
        /*

        *
        **
        ***
        ****

         */

//        for (int i = 1;i<=5;i++){
//            // I have to print i / lineno star
//            printStar(6-i);
//            // print next line
//            System.out.println();
//        }

//        for (int i = 1;i<=5;i++){
//            // print x space
//            printSpace(5-i);
//            //print y stars
//            printStar(2*i - 1);
//            // print next line
//            System.out.println();
//
//        }

        for (int i = 1;i<=5;i++){
            // print x space
            printSpace(i-1);
            //print y stars
            printStar(11 - 2*i);
            // print next line
            System.out.println();

        }




    }


}
