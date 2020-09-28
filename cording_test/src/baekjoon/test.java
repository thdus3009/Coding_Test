package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
	
	public static int[][] arr; //ArrayList<Integer>형 배열
	public static boolean[] visited; //int형 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//인접 행렬을 이용해서 풀기
		int point = sc.nextInt();
		int line = sc.nextInt();
		int start = sc.nextInt();
		
		arr = new int[point+1][point+1];
		
		for(int i=1; i<=line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		visited = new boolean[point+1];
		dfs(start);
		
		System.out.println();
		
		visited = new boolean[point+1];
		bfs(start);

	}
	
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start+" ");
		
		for(int i=1; i<arr.length;i++) {
			if(arr[start][i]==1 && visited[i]==false) {
				dfs(i);
			}
		}
				
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		
		visited[start] = true;
		que.add(start);
		
		while(!que.isEmpty()) {
			int st = que.poll();
			System.out.println(st+" ");
			
			for(int i=1; i<arr.length;i++) {
				if(arr[st][i]==1 && visited[i]==false) {
					visited[i]=true;
					que.add(i);
				}
			}
		}
	}

}
