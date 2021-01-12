package class02;

public class nCr {

    public static int factorial(int number){
        int fact = 1;
        for (int i=1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){

        int n = 5;
        int r = 2;

        int nfact = factorial(n);
        int rfact = factorial(r);
        int nminusrfact = factorial(n-r);


        int ans = nfact / (rfact * nminusrfact);
        System.out.print(ans);

    }

}
