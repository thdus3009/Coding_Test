package test;

import java.util.*;

public class baekjoon_2667_Apart_Num {

	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int[][] arr = new int [n][n];
	
	public static void main(String[] args) {
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		List<Integer> apart = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=0)
				apart.add(func(i,j,arr[i][j]));
			}
		}
		
		//총 단지수
		System.out.println(apart.size());
		
		//단지들 오름차순으로 출력
		Collections.sort(apart);
		for (int i = 0; i < apart.size(); i++) { System.out.println(apart.get(i)); }
	}
	
	public static int func(int row,int col,int num) {
		
		if(row==-1||col==-1||row==n||col==n) return 0;
		
		if(arr[row][col]!=num) return 0;

		if(arr[row][col]==num) arr[row][col]=0; 

		return 1+func(row+1,col,num)+func(row-1,col,num)+func(row,col+1,num)+func(row,col-1,num);
		
	}
}
