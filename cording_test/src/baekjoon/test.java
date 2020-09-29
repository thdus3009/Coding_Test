package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
	
	public static int[][] arr; 
	public static boolean[][] visited;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};
	public static int[] aparts; //아파트당 가구수
	public static int apartNum; //아파트갯수
	public static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		arr=new int[n][n];
		visited=new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			String line = sc.next();
			for(int j=0;j<n;j++) {
				arr[i][j]=line.charAt(j)-'0';
			}
		}
		
		aparts=new int[n*n];
		apartNum=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==1 && !visited[i][j]) {
					apartNum++;
					dfs(i,j);
				}
			}
		}
		System.out.println(apartNum);
		Arrays.sort(aparts);
		
		for(int i=0;i<aparts.length;i++) {
			if(aparts[i]!=0) {
				System.out.println(aparts[i]);
			}
		}
	}
	
	public static void dfs(int x, int y) {
		visited[x][y]=true;
		aparts[apartNum]++;
		for(int i=0;i<4;i++) {
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
