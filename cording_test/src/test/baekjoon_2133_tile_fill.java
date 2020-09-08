package test;

import java.util.Scanner;

public class baekjoon_2133_tile_fill { //baekjoon 14852 << 유사문제
	
	static int[] arr = new int[31];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = block(n);
		System.out.println(count);
	}
	
	public static int block(int n) {
		if(n==0) return 1;  //중요
		if(n==1) return 0;
		if(n==2) return 3;
		if(arr[n] != 0) return arr[n]; //중요
		
		int result = block(n-2)*3;
		
		for(int i=3; i<=n; i++) {
			if(i%2==0) {
				result +=block(n-i)*2; //여기서  arr[n]=1이 필요함
			}
		}
		return arr[n]=result;
	}
}
