package test;

import java.util.Scanner;

public class n3709_block_fill_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10001];
		int n = sc.nextInt();
		
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=3; i<=n; i++) {
			arr[i] = (arr[i-1]+arr[i-2])%100000007;
		}
		
		System.out.println(arr[n]);
	}


}
