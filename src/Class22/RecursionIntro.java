package Class22;

public class RecursionIntro {

    public static void printnum(int num) {

        // if I got 1 as number i need not to call anyone
        if (num == 1){
            System.out.println(num);
            return;
        }
        //print till n-1
        printnum(num-1);
        // I will print my num
        System.out.println(num);
    }

    public static void printNumReverse(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNumReverse(num-1);
    }



    public static int findsum(int num){
        if (num == 1){
            return 1;
        }
        // recursion to find sum n-1
        int sum = findsum(num-1);
        // i will myself to it
        sum = sum + num;
        //return the ans
        return sum;
    }

    public static int fact(int num){
        if (num == 0){
            return 1;
        }
        int factTillNminus1 = fact(num - 1);
        int ans = num * factTillNminus1;
        return ans;
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibOfN = fibonacci(n-1) + fibonacci(n-2);
        return fibOfN;
    }



    public static void main(String[] args) {
        // can you print 1-10 using recursion
//        printNumReverse(10);
//        printnum(4);
        System.out.println(fibonacci(8));

    }


}
