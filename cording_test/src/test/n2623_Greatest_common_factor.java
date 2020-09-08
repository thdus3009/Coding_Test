package test;

import java.util.Scanner;

public class n2623_Greatest_common_factor {

	public static void main(String[] args) {
		
		//최대 공약수 구하기  64 128
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big = num1;
		int small = num2;
		
		if(num2>num1) {
			big = num2;
			small = num1;
		}
		
		int result = func(big,small);
		
//		int result=0;//최대공약수 담을 변수
//		for(int i=1; i<=small; i++) { //i는 공약수
//			if(big%i==0&&small%i==0) {
//				result = i;
//			}
//		}
		
		
		System.out.println(result); //최대 공약수
		
		System.out.println((big*small)/result); //최소 공배수
		
	}
	
	public static int func(int a, int b) {
		if(b==0) return a;
	    else return func(b, a%b);
	}
}
