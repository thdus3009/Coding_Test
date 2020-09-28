package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260_2_array {
	
	public static int[][] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		int line = sc.nextInt();
		int start = sc.nextInt();
		
		arr = new int[point+1][point+1]; // 인덱스가 1부터 해당point까지 이기 때문
		
		for(int i=1; i<=line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		visited = new boolean[point+1];  //index: 1~point
		dfs(start);
		
		System.out.println();
		
		visited = new boolean[point+1];
		bfs(start);
		
	}
	
	public static void dfs(int start) {
		System.out.print(start+" ");
		visited[start] = true;
		
		for(int a=1; a<arr.length; a++) {
			if(arr[start][a]==1 && visited[a]==false) {
				dfs(a);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		visited[start] = true;
		que.add(start);
		
		while(!que.isEmpty()) {
			int st = que.poll();
			System.out.print(st+" ");
			
			for(int i=1; i<arr.length; i++) {
				if(arr[st][i]==1 && visited[i]==false) {
					que.add(i);
					visited[i]=true;
				}
			}
		}
		
	}
}
