package test;

import java.util.*;

public class n1915_Fibonacci {

	static Scanner sc = new Scanner(System.in);
	
	static int n = sc.nextInt();
	
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int result;
		
		if(n==1) result = 1; 
		else result = func(1,1,n);
		
		System.out.println(result);
	}
	
	static int sum=1;
	public static int func(int a, int b, int n) {
		//System.out.println(sum);
		sum++;
		if(sum==n) {
			return a;
		}
		return func(a+b,a,n);
	}
}
