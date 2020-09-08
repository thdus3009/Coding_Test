package test;

import java.util.Scanner;

public class n3716_block_fill_5 {
	static int[] dp = new int[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp[1]=1;
		dp[2]=2;
		dp[3]=6;
		int result = block(n);
		System.out.println(result);
	}
	
	public static int block(int n){
		int DIV = 1000;
		
		if(dp[n] != 0) return dp[n];
		return dp[n] = (block(n - 3) * 3  + 
				block(n - 2)  + 
				block(n - 1) ) % DIV;
	}
}
