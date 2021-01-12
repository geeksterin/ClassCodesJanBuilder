package class02;

public class Class02 {

    public static void main(String[] args){

        // i will print my name 10 times
        // for (__,__,__)
//        for(int counter = 0; counter <= 3; counter = counter+1){
//            for(int counter2 = 0;counter2 <= 3;counter2=counter2+1){
//                System.out.println(counter2);
//            }
//        }

        for (int lineno = 1;lineno <= 5; lineno++){
            // in each iteration i have to print few numbers
            // print number from 1 to lineno.
            for(int counter = 1;counter <= lineno;counter++){
                System.out.print(counter);
            }
            //either
            System.out.print("\n");
            //or
//            System.out.println();
        }



    }

}
