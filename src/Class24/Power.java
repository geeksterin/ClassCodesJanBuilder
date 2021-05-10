package Class24;

public class Power {

    public static int pow(int x,int n){

        if(n==0){
            return 1;
        }

        int findnMnus1 = pow(x,n-1);
        return x * findnMnus1;

    }


    public static int powEff(int x,int n){

        if(n==0){
            return 1;
        }
        int halfPow = powEff(x,n/2);
        int result;
        if(n%2==0){
            result = halfPow * halfPow;
        }
        else {
            result = halfPow * halfPow * x;
        }
        return result;
    }

    public static void printArr(int[] arr, int num){
        if (num == arr.length){
            return;
        }
        System.out.println(arr[num]);
        printArr(arr,num+1);
    }

    public static void printArrRev(int[] arr, int num){
        if (num == arr.length){
            return;
        }
        printArrRev(arr,num+1);
        System.out.println(arr[num]);
    }


    public static void main(String[] args) {
        int x = 5;
        int n = 6;

//        System.out.println(pow(x,n));
//        System.out.println(powEff(x,n));

        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArrRev(arr,0);

    }


}