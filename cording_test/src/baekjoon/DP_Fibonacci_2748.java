package baekjoon;

import java.util.Scanner;

public class DP_Fibonacci_2748 {
	static long[] arr = new long[91];//n은 90보다 작거나 같다.(1~90)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		func(n);
		
		System.out.println(arr[n]);
	}
	public static long func(int n) {
		if(n==0) return arr[0]=0;
		if(n==1) return arr[1]=1;
		if(n==2) return arr[2]=1;
		if(arr[n]!=0) return arr[n];
		
		return arr[n]=func(n-1)+func(n-2);
	}
}
