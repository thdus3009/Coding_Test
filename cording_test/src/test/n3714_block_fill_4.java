package test;

import java.util.Scanner;

public class n3714_block_fill_4 {
	static int[] dp = new int[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp[1]=1;
		dp[2]=5;
		int result = block(n);
		System.out.println(result);
	}
	
	public static int block(int n){
		int DIV = 100007;
		
		if(dp[n] != 0) return dp[n];
		return dp[n] = (block(n - 3) * 2  + 
				block(n - 2) * 5 + 
				block(n - 1) ) % DIV;
	}
}
