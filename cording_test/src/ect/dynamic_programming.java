package ect;

public class dynamic_programming {
	//피보나치 수열 (재귀아닌 DP(동적계획법)로 풀기)
	//1 1 2 3 5 8 13 21 34 55
	static int[] arr = new int[100];
		
	public static void main(String[] args) {
		int n =10;
		func(n);
		System.out.println(arr[n]);
	}
	public static int func(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		if(arr[n]!=0) return arr[n]; //n-1아래 수들을 배열에 저장시켜준다.
		return arr[n]=func(n-1)+func(n-2);
	}
}
