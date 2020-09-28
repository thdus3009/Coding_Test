package baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_virus_2606 {
	
	// 인접리스트 + bfs형태로 풀었음
	// 이문제 경우 4번,7번 컴퓨터는 들리면 1번컴퓨터와 연결되지 않기 때문에 포함되서는 안됨
	
	public static ArrayList<Integer>[] arr;
	public static boolean[] visited;
	public static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com = sc.nextInt();
		int line = sc.nextInt();
		
		arr=new ArrayList[com+1];
		
		for(int i=1; i<=com; i++) {
			arr[i]=new ArrayList<Integer>();
		}
		
		for(int i=1; i<=line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		visited = new boolean[com+1];
		count=0;
		bfs(1);
		
		System.out.println(count);
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		visited[start] =true;
	
		que.add(start);
		while(!que.isEmpty()) {
			int st = que.poll();
			for(int a : arr[st]) {
				if(!visited[a]) {
					que.add(a);
					visited[a]=true;
					count++;
				}
			}
		}
		
	}
}
