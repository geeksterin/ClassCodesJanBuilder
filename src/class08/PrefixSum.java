package class08;

import java.util.Scanner;

class Query {
    int left;
    int right;
}

public class PrefixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int distance[] = new int[n];
        for(int i=0;i<n;i++) {
            distance[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        Query queries[] = new Query[k];
        for(int i= 0 ; i<k ; i++) {
            Query query = new Query();
            query.left = scanner.nextInt();
            query.right = scanner.nextInt();
            queries[i] = query;
        }
        int prefix[] = new int[n];
        prefix[0] = distance[0];
        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1] + distance[i];
        }
    }
}
// 300, 400, 300 , 500
// 300, 700, 1000, 1500
// 2 , 5   - 1
// 1 , 6   - 2
