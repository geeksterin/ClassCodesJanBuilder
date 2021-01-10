package introToJava;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.print("Hello World");
//
//		int value = 10;
//		System.out.print(value);
//		System.out.println("value");
//
//		int temp = scn.nextInt();
//		System.out.println(temp);
//
//		char temp2 = 'a';
//
//		double temp3 = 3.14;
//
//		String str = "abcd";

//		int tp = scn.nextInt();
//		double fr = ((9 * tp * 1.0) / 5) + 32;
//		System.out.println(fr);
//		
//		
//		float manjunath = 3.14f;
//		int temp5 = (int)manjunath;
//		System.out.println(temp5);

//		for (int i = 0; i < 10; i++) {
//			System.out.println("Geekster");
//		}

//		for (int i = 5; i >= 0; i--) {
//			System.out.println("Geekster");
//		}

//		for (int i = 0; i < 5; i++) {
//			System.out.println((i + 1) + "-" + (i + 1));
//		}

//		int n = scn.nextInt();
//
//		System.out.println((n * (n + 1)) / 2);
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum = sum + i;
//		}
//
//		System.out.println(sum);

////		Approach 1
//		int n = scn.nextInt();
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				count++;
//			}
//			
//			if(count>2) {
//				break;
//			}
//		}
//
//		if (count == 2) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Not Prime");
//		}

//	Approach 2
		int n = scn.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime==true) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
