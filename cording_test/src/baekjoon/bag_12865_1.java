package baekjoon;

import java.util.*;

public class bag_12865_1 {
	
	static int f_value=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int things = sc.nextInt(); //4 물건갯수
		int weight = sc.nextInt(); //7 무게
		int[][] arr = new int[things][2];
		
		for(int n=0; n<things;n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[n][0]=a;
			arr[n][1]=b;
		}
		
		int answer = func(arr,things,weight,0); //제한된 무게의 최대의 가치값
		
	}
	public static int func(int[][] arr,int things,int weight,int f_weight) {
		for(int i=0; i<things; i++) {
			if(weight>=arr[i][0]) {//무게가 제한이하인지
				if(f_value<arr[i][1]) {
					f_value=arr[i][1];
				}				
			}
		}
		
		return 0;
	}

}
