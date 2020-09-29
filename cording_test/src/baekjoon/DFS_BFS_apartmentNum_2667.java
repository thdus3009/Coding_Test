package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class DFS_BFS_apartmentNum_2667 {
	
	public static int n;
	public static int dx[] = {1,-1,0,0};
	public static int dy[] = {0,0,1,-1}; 
	public static int[][] arr; //전체 맵
	public static boolean[][] visited; //방문했는지 확인 (초기값 false)
	public static int apartNum=0; //아파트 총 갯수
	public static int[] aparts; //한 아파트당 가구 수 ex.aparts[1]=7 / 1번째 아파트는 7가구있다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		arr = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String input = sc.next(); // 0110100
			for(int j=0; j<n; j++) {
				arr[i][j] = input.charAt(j)-'0'; 
			}
		}

		aparts=new int[n*n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1 && !visited[i][j]) {
					apartNum++;
					dfs(i,j);
				}
			}
		}
		System.out.println(apartNum); //아파트 총 갯수
		Arrays.sort(aparts); //내부 인덱스별 숫자를 오름차순해준다.
		
		for(int i=0; i<aparts.length; i++) {
			if(aparts[i]!=0) {
				System.out.println(aparts[i]);
			}
		}
	}	
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		aparts[apartNum]++; //apart[1]=0;가 1씩증가
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				if(arr[nx][ny]==1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
