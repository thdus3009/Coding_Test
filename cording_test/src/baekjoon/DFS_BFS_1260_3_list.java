package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260_3_list {
	
	public static ArrayList<Integer>[] arr; //ArrayList<Integer>형 배열
	public static boolean[] visited; //int형 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		int line = sc.nextInt();
		int start = sc.nextInt();
		
		arr = new ArrayList[point+1]; // 인덱스가 1부터 해당point까지 이기 때문
		
		//중요 > 배열안에 리스트선언
		for(int i=1; i<point+1; i++) {
			arr[i]= new ArrayList<Integer>();
		}
		
		for(int i=1; i<=line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a].add(b);
			arr[b].add(a);
		}
		
		//오름차순 정렬
		//방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
       for (int i = 1; i < point + 1; i++) {
            Collections.sort(arr[i]);
        }
		
		visited = new boolean[point+1];  //index: 1~point
		dfs(start);
		
		System.out.println();
		
		visited = new boolean[point+1];
		bfs(start);
		
	}
	
	public static void dfs(int start) {
		
		visited[start]=true;
		System.out.print(start+" ");
		
		for(int y : arr[start]) { 
			if(!visited[y]) {
				dfs(y);
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
			
			for(int y:arr[st]) {
				if(!visited[y]) {
					visited[y]=true;
					que.add(y);
				}
			}
		}
		
	}
}
