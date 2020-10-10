package ect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Big_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //총 주어진 자연수들 갯수
		int count = sc.nextInt(); //더할 수 있는 횟수
		int repeat = sc.nextInt(); //하나당 반복할 수 있는 횟수
		
		ArrayList<Integer> arr = new ArrayList<>(num);
		for(int i=1; i<=num; i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		int result=0; //누적해서 더하줄 변수선언
		int add=0;
		
		while(add!=count) { //단점 : 속도가 너무 느리다.
			for(int i=0;i<repeat; i++) {
			result+=arr.get(num-1);
			add++;
			}
			result+=arr.get(num-2);
			add++;
		}
		
		System.out.println(result);
		
		//5 8 3
		//2 4 5 4 6
		
		//5 7 2
		//3 4 3 4 3
	}
}
