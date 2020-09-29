package baekjoon;

import java.util.Scanner;

public class DFS_BFS_cabbage_1012 {

	public static int[][] arr;
	public static boolean[][] visited;
	public static int[] dx= {1,-1,0,0};
	public static int[] dy= {0,0,1,-1};
	public static int worm=0;
	public static int x;
	public static int y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			int count = sc.nextInt();
			
			arr = new int[x][y];
			visited = new boolean[x][y];
			
			for(int j=0;j<count;j++) {
				int nx=sc.nextInt();
				int ny=sc.nextInt();
				arr[nx][ny]=1;
			}
			
			for(int k=0;k<x;k++) {
				for(int l=0;l<y;l++) {
					if(arr[k][l]==1&&!visited[k][l]) {
						worm++;
						dfs(k,l);
					}
				}
			}
			System.out.println(worm);
			worm=0;
		}
	}	
	
	public static void dfs(int a, int b) {
		visited[a][b]=true;
		for(int i=0; i<4; i++) {
			int nx=a+dx[i];
			int ny=b+dy[i];
			
			if(nx>=0 && ny>=0 && nx<x && ny<y) {
				if(arr[nx][ny]==1&&!visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}
