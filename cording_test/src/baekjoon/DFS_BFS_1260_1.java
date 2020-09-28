package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260_1 {
	
	public static int[][] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt(); // 정점갯수
		int line = sc.nextInt(); //간선갯수
		int start = sc.nextInt(); //시작하는 숫자
		
		arr = new int [point+1][point+1];
		
		//인접행렬방식 (/인접리스트)
		for(int i=1;i<=line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		//깊이우선탐색
		visited = new boolean[point+1];//초기값 false 1~4
		dfs(start);
		
		System.out.println();
		
		//넓이우선탐색
		visited = new boolean[point+1];//재선언
		bfs(start);
		
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start+" ");
		
		for(int a=1; a<arr.length; a++) {
			if(arr[start][a]==1 && visited[a]==false) {
				dfs(a);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(start);
		visited[start]= true;
		System.out.print(start+" ");
		
		while(!que.isEmpty()) {
			int temp = que.poll();
			
			for(int i=1; i<arr.length; i++) {
				if(arr[temp][i]==1 && visited[i]==false) {
					
					que.add(i);
					visited[i]=true;
					System.out.print(i+" ");
				}
			}
		}
	}
}
