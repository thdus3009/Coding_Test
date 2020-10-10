package ect;

import java.util.Arrays;
import java.util.Scanner;

public class Number_Card {
	static int n;
	static int m;  	
	static int[][] arr;
	static int[] result;
	
	public static void main(String[] args) {
		//각 행에서 가장 낮은 수를 골라내고 그중에서 높은 수의 값을 찾는다.
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); //행
		m = sc.nextInt(); //열
		
		arr = new int[n+1][m+1];
		result = new int[n+1]; //각행의 가장 낮은수들 넣는 배열
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<=n;i++) {
			func(i);
		}
		
		Arrays.sort(result);
		
		System.out.println(result[n]);
	}
	
	public static void func(int i) {
		result[i]=100; //카드 값의 최대값을 몰라 일단 100설정
		for(int j=1;j<=m;j++) {
			if(arr[i][j]<result[i]) {
				result[i]=arr[i][j];
			}
		}
	}
	
	//2 4
	//7 3 1 8
	//3 3 3 4
	
	//3 3
	//3 1 2
	//4 1 4
	//2 2 2
}
