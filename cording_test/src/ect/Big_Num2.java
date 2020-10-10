package ect;

import java.util.*;


public class Big_Num2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //총 주어진 자연수들 갯수
		int count = sc.nextInt(); //더할 수 있는 횟수
		int repeat = sc.nextInt(); //하나당 반복할 수 있는 횟수
		
		int[] arr= new int[num+1];
		for(int i=1; i<=num; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int result = ((count/(repeat+1))*(repeat*arr[num]+arr[num-1]))+((count%(repeat+1))*arr[num]);
		// (8/4)*((3*6)+5) + (0*6)
		
		System.out.println(result);
		
		//5 8 3
		//2 4 5 4 6
		//6 6 6 '5'/ 6 6 6 '5'/
		
		//5 7 2
		//3 4 3 4 3
		//4 4 '4' / 4 4 '4' / 4
		
		//((count/(repeat+1))*(repeat*arr[n]+arr[n-1]))+((count%(repeat+1))*arr[n])의 결과만큼 반복
	}
}
