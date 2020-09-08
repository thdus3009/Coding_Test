package test;

import java.util.Scanner;

public class n3713_block_fill_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[10001];
		
		arr[1]=1;
		arr[2]=3;
		for(int i=3; i<=n; i++) {
			arr[i]=arr[i-1]+(arr[i-2]*2);
		}
		
		System.out.println(arr[n]);
	}
}
