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
        for(int i=0;i<k;i++) {
            Query query = queries[i]; //3....4
            int result = 0;
            if(query.left == 0)
                result = prefix[query.right];
            else
                result = prefix[query.right] - prefix[query.left - 1];
            System.out.println(result);
        }
    }
}

//{-2, -3, 4, -1, -2, 1, 5, -3}
