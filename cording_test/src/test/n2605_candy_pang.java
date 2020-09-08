package test;

import java.util.*;

public class n2605_candy_pang {
	
	static int[][] arr = new int[7][7]; //func에도 사용해야되서 class로 빼준다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int cnt = 0 ; //선택가능한 3개이상의 블록들의 갯수를 담을 변수선언 
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				int temp = 0;
				if(arr[i][j]!=0) { 
					temp = func(i,j,arr[i][j]); 
				}
				if(temp>=3) cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	//해당 조건을 찾으면 0으로 return, 못찾으면 계속 탐색
	public static int func(int row,int col,int color) {
		//배열을 벗어나면 리턴(재귀 돌릴때 0~6 벗어남 방지)
		if(row==-1||col==-1||row==7||col==7) return 0;
		
		//같은색이 아니면 리턴 
		if(arr[row][col]!=color) return 0;
		
		//같은색이면 0으로 만듬
		if(arr[row][col]==color) arr[row][col] = 0;//정보가 일치하면 색깔과 상관없는 숫자인 0으로 만들어서 재탐색을 방지한다.
		
		//상, 하, 좌, 우 로 탐색
		return 1+func(row-1, col, color)+func(row+1, col, color)+func(row, col-1, color)+func(row, col+1, color);
	}
}
