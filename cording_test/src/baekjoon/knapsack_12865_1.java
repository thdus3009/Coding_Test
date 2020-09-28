package baekjoon;

import java.util.*;

public class knapsack_12865_1 { //모든 경우의 수를 다 해봐야 한다.(2의 n제곱)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //아이템 갯수
		int k = sc.nextInt(); //수용가능 무게
		
		int[][] dp = new int[n+1][k+1]; //0번 인덱스는 빼기 위해서
		
		int[] w = new int[n+1]; //해당아이템들의 무게
		int[] v = new int[n+1]; //해당아이템들의 가치
		
		for(int i=1; i<=n; i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		
		for(int i=1; i<=n; i++) { //dp에 값을 담을 이중for문 (i-아이템 / j-제한무게)
			for(int j=1; j<=k; j++) {
				if(w[i]>j) {//수용무게보다 아이템의 무게가 더클때, 해당무게의 이전 최대가치값을 넣어준다. 
					dp[i][j] = dp[i-1][j];  
				}else if(w[i]<=j) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
				}
			}
		}
		System.out.println(dp[n][k]);
	}


}
