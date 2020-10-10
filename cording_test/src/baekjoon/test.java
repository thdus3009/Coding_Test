package baekjoon;

import java.util.*;


public class test {
	
	public static ArrayList<Integer>[] arr;
	public static boolean[] visited;
	public static void main(String[] args) {
		//인접행렬 n2 , 인접리스트 n+l
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		int line = sc.nextInt();
		int start = sc.nextInt();
		
		arr = new ArrayList[point+1];
		
		for(int i=1; i<point+1; i++) {
			arr[i]=new ArrayList<>();
		}
		
		for(int i=1; i<line; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		for(int i=1; i<point+1; i++) {
			Collections.sort(arr[i]);
		}
		
		visited = new boolean[point+1];
		dfs(start);
		
		System.out.println();
		
		visited = new boolean[point+1];
		bfs(start);
		
		
	}
	
	public static void dfs(int start) {
		if(visited[start]) {
			return;
		}
		
		System.out.println(start+" ");
		visited[start]=true;
		
		for(int y : arr[start]) {
			if(!visited[y]) {
				dfs(y);
			}
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<>();
		visited[start] =true;
		que.add(start);

		while(!que.isEmpty()) {
			int st = que.poll();
			System.out.println(st+" ");
			
			for(int y:arr[st]) {
				if(!visited[y]) {
					visited[y]=true;
					que.add(y);
				}
			}
			
		}
	}
}
