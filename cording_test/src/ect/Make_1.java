package ect;

import java.util.Scanner;

public class Make_1 {
	public static void main(String[] args) {
		//n은 k로 나누어 떨어질 때만 나눌 수 있다.
		//1을 만들 수 있는 최소횟수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
		
		count+=n%k; //나머지 갯수 더하기
		n=n-(n%k); //원래값에 나머지 갯수 뺀 값 => 나눴을때 딱 떨어지는 수로 만들기
		
		while(n!=1) {
			n=n/k;
			count+=1;
		}
		System.out.println(count);
		
		//25 5 > 25%5 ..0 / 총 2번
		//17 4 > 17%4 ..1 / 총 3번
		//19 4 > 19%4 ..3 / 총 5번
	}
}
