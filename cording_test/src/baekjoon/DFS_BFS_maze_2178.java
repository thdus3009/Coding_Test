package baekjoon;

import java.util.Scanner;

public class DFS_BFS_maze_2178 {
	
	public static int[][] arr;
	public static boolean[][] visited;
	public static int[] dx= {1,-1,0,0};
	public static int[] dy= {0,0,1,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		arr= new int[n][m];
		visited= new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String st = sc.next();
			for(int j=0;j<m;j++) {
				arr[i][j]=st.charAt(j)-'0';
			}
		}
		
		//
	}	
}
